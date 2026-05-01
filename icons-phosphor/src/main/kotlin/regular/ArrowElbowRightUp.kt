package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorRegularIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 101.66f),
                    PathNode.CurveTo(220.15945f, 103.16222f, 218.12328f, 104.006294f, 216.0f, 104.006294f),
                    PathNode.CurveTo(213.87672f, 104.006294f, 211.84055f, 103.16222f, 210.34f, 101.66f),
                    PathNode.LineTo(176.0f, 67.31f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 196.41827f, 172.41827f, 200.0f, 168.0f, 200.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(19.581722f, 200.0f, 16.0f, 196.41827f, 16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 187.58173f, 19.581722f, 184.0f, 24.0f, 184.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.LineTo(160.0f, 67.31f),
                    PathNode.LineTo(125.66f, 101.66f),
                    PathNode.CurveTo(122.534065f, 104.785934f, 117.465935f, 104.785934f, 114.34f, 101.66f),
                    PathNode.CurveTo(111.214066f, 98.534065f, 111.214066f, 93.465935f, 114.34f, 90.34f),
                    PathNode.LineTo(162.34f, 42.34f),
                    PathNode.CurveTo(163.84055f, 40.837784f, 165.87672f, 39.993706f, 168.0f, 39.993706f),
                    PathNode.CurveTo(170.12328f, 39.993706f, 172.15945f, 40.837784f, 173.66f, 42.34f),
                    PathNode.LineTo(221.66f, 90.34f),
                    PathNode.CurveTo(223.16223f, 91.840546f, 224.00629f, 93.876724f, 224.00629f, 96.0f),
                    PathNode.CurveTo(224.00629f, 98.123276f, 223.16223f, 100.159454f, 221.66f, 101.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
