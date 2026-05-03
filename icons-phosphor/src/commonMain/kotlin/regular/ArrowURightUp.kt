package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorRegularIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 85.66f),
                    PathNode.CurveTo(220.15945f, 87.16222f, 218.12328f, 88.006294f, 216.0f, 88.006294f),
                    PathNode.CurveTo(213.87672f, 88.006294f, 211.84055f, 87.16222f, 210.34f, 85.66f),
                    PathNode.LineTo(176.0f, 51.31f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 203.34622f, 147.34622f, 232.0f, 112.0f, 232.0f),
                    PathNode.CurveTo(76.65378f, 232.0f, 48.0f, 203.34622f, 48.0f, 168.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(48.0f, 75.58172f, 51.581722f, 72.0f, 56.0f, 72.0f),
                    PathNode.CurveTo(60.418278f, 72.0f, 64.0f, 75.58172f, 64.0f, 80.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.CurveTo(64.0f, 194.50967f, 85.49033f, 216.0f, 112.0f, 216.0f),
                    PathNode.CurveTo(138.50967f, 216.0f, 160.0f, 194.50967f, 160.0f, 168.0f),
                    PathNode.LineTo(160.0f, 51.31f),
                    PathNode.LineTo(125.66f, 85.66f),
                    PathNode.CurveTo(122.534065f, 88.785934f, 117.465935f, 88.785934f, 114.34f, 85.66f),
                    PathNode.CurveTo(111.214066f, 82.534065f, 111.214066f, 77.465935f, 114.34f, 74.34f),
                    PathNode.LineTo(162.34f, 26.34f),
                    PathNode.CurveTo(163.84055f, 24.837784f, 165.87672f, 23.993708f, 168.0f, 23.993708f),
                    PathNode.CurveTo(170.12328f, 23.993708f, 172.15945f, 24.837784f, 173.66f, 26.34f),
                    PathNode.LineTo(221.66f, 74.34f),
                    PathNode.CurveTo(223.16223f, 75.840546f, 224.00629f, 77.876724f, 224.00629f, 80.0f),
                    PathNode.CurveTo(224.00629f, 82.123276f, 223.16223f, 84.159454f, 221.66f, 85.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
