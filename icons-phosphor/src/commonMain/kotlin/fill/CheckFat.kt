package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorFillIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.31f, 90.91f),
                    PathNode.LineTo(114.91f, 219.31f),
                    PathNode.CurveTo(108.66246f, 225.55345f, 98.53754f, 225.55345f, 92.29f, 219.31f),
                    PathNode.LineTo(20.67f, 147.31f),
                    PathNode.CurveTo(14.433214f, 141.06361f, 14.433214f, 130.9464f, 20.67f, 124.7f),
                    PathNode.LineTo(40.67f, 104.7f),
                    PathNode.CurveTo(46.912926f, 98.483154f, 57.007072f, 98.483154f, 63.25f, 104.7f),
                    PathNode.LineTo(104.0f, 144.22f),
                    PathNode.LineTo(200.76f, 48.65f),
                    PathNode.CurveTo(207.00409f, 42.426514f, 217.10591f, 42.426514f, 223.35f, 48.65f),
                    PathNode.LineTo(243.3f, 68.19f),
                    PathNode.CurveTo(246.33032f, 71.19294f, 248.03589f, 75.281715f, 248.03778f, 79.54792f),
                    PathNode.CurveTo(248.03966f, 83.81412f, 246.33768f, 87.9044f, 243.31f, 90.91f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
