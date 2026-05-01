package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorFillIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 96.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.CurveTo(216.0f, 91.58172f, 212.41827f, 88.0f, 208.0f, 88.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(131.58173f, 88.0f, 128.0f, 91.58172f, 128.0f, 96.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.LineTo(64.0f, 52.0f),
                    PathNode.CurveTo(64.0f, 45.37258f, 69.37258f, 40.0f, 76.0f, 40.0f),
                    PathNode.CurveTo(81.79151f, 39.97633f, 86.833206f, 43.95247f, 88.16f, 49.59f),
                    PathNode.CurveTo(89.07464f, 53.880913f, 93.27452f, 56.634617f, 97.5743f, 55.762596f),
                    PathNode.CurveTo(101.87408f, 54.890575f, 104.66932f, 50.71822f, 103.84f, 46.41f),
                    PathNode.CurveTo(101.040215f, 33.2883f, 89.4169f, 23.932035f, 76.0f, 24.0f),
                    PathNode.CurveTo(60.53603f, 24.0f, 48.0f, 36.53603f, 48.0f, 52.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.LineTo(16.0f, 96.0f),
                    PathNode.CurveTo(11.581722f, 96.0f, 8.0f, 99.58172f, 8.0f, 104.0f),
                    PathNode.LineTo(8.0f, 144.0f),
                    PathNode.CurveTo(8.03307f, 174.91423f, 33.085762f, 199.96693f, 64.0f, 200.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(64.0f, 220.41827f, 67.58172f, 224.0f, 72.0f, 224.0f),
                    PathNode.CurveTo(76.41828f, 224.0f, 80.0f, 220.41827f, 80.0f, 216.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.LineTo(176.0f, 216.0f),
                    PathNode.CurveTo(176.0f, 220.41827f, 179.58173f, 224.0f, 184.0f, 224.0f),
                    PathNode.CurveTo(188.41827f, 224.0f, 192.0f, 220.41827f, 192.0f, 216.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.CurveTo(222.91423f, 199.96693f, 247.96693f, 174.91423f, 248.0f, 144.0f),
                    PathNode.LineTo(248.0f, 104.0f),
                    PathNode.CurveTo(248.0f, 99.58172f, 244.41827f, 96.0f, 240.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 104.0f),
                    PathNode.LineTo(200.0f, 144.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.LineTo(144.0f, 104.0f),
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
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
