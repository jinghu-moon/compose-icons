package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorFillIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 188.41827f, 228.41827f, 192.0f, 224.0f, 192.0f),
                    PathNode.CurveTo(219.58173f, 192.0f, 216.0f, 188.41827f, 216.0f, 184.0f),
                    PathNode.CurveTo(215.9857f, 148.84402f, 195.04854f, 117.06987f, 162.74963f, 103.1874f),
                    PathNode.CurveTo(130.45073f, 89.30494f, 92.988365f, 95.97828f, 67.47f, 120.16f),
                    PathNode.LineTo(93.66f, 146.34f),
                    PathNode.CurveTo(95.95064f, 148.6281f, 96.63632f, 152.07126f, 95.39698f, 155.06232f),
                    PathNode.CurveTo(94.15764f, 158.05338f, 91.237656f, 160.00255f, 88.0f, 160.0f),
                    PathNode.LineTo(24.0f, 160.0f),
                    PathNode.CurveTo(19.581722f, 160.0f, 16.0f, 156.41827f, 16.0f, 152.0f),
                    PathNode.LineTo(16.0f, 88.0f),
                    PathNode.CurveTo(15.997452f, 84.762344f, 17.94662f, 81.84236f, 20.93768f, 80.60302f),
                    PathNode.CurveTo(23.92874f, 79.36368f, 27.371908f, 80.04936f, 29.66f, 82.34f),
                    PathNode.LineTo(56.14f, 108.82f),
                    PathNode.CurveTo(86.23897f, 80.0505f, 130.59575f, 72.00565f, 168.88097f, 88.37255f),
                    PathNode.CurveTo(207.16618f, 104.73944f, 231.99971f, 142.3631f, 232.0f, 184.0f),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
