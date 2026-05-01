package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) return _folderSimpleUser!!
        _folderSimpleUser = phosphorFillIcon(
            name = "FolderSimpleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.73f, 221.94f),
                    PathNode.CurveTo(232.36993f, 224.34135f, 231.85753f, 226.90373f, 230.34334f, 228.87433f),
                    PathNode.CurveTo(228.82916f, 230.84492f, 226.48515f, 231.99992f, 224.0f, 232.0f),
                    PathNode.LineTo(160.0f, 232.0f),
                    PathNode.CurveTo(157.5285f, 231.99507f, 155.19804f, 230.84808f, 153.68652f, 228.89267f),
                    PathNode.CurveTo(152.17499f, 226.93727f, 151.65211f, 224.39302f, 152.27f, 222.0f),
                    PathNode.CurveTo(154.86266f, 212.3609f, 160.96553f, 204.03943f, 169.38f, 198.67f),
                    PathNode.CurveTo(160.22371f, 189.51971f, 157.48209f, 175.7543f, 162.43385f, 163.79414f),
                    PathNode.CurveTo(167.3856f, 151.83398f, 179.0553f, 144.03517f, 192.0f, 144.03517f),
                    PathNode.CurveTo(204.9447f, 144.03517f, 216.6144f, 151.83398f, 221.56615f, 163.79414f),
                    PathNode.CurveTo(226.51791f, 175.7543f, 223.77629f, 189.51971f, 214.62f, 198.67f),
                    PathNode.CurveTo(223.02249f, 204.02493f, 229.12395f, 212.32304f, 231.73f, 221.94f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.LineTo(130.67f, 72.0f),
                    PathNode.LineTo(102.93f, 51.2f),
                    PathNode.CurveTo(100.15643f, 49.13055f, 96.79053f, 48.008583f, 93.33f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(31.163445f, 48.0f, 24.0f, 55.163445f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(124.41828f, 216.0f, 128.0f, 212.41827f, 128.0f, 208.0f),
                    PathNode.CurveTo(128.0f, 203.58173f, 124.41828f, 200.0f, 120.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.LineTo(93.33f, 64.0f),
                    PathNode.LineTo(121.07f, 84.8f),
                    PathNode.CurveTo(123.84357f, 86.869446f, 127.20947f, 87.99142f, 130.67f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(216.0f, 124.41828f, 219.58173f, 128.0f, 224.0f, 128.0f),
                    PathNode.CurveTo(228.41827f, 128.0f, 232.0f, 124.41828f, 232.0f, 120.0f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 79.163445f, 224.83656f, 72.0f, 216.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
