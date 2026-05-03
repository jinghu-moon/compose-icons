package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) return _arrowCircleDown!!
        _arrowCircleDown = phosphorLightIcon(
            name = "ArrowCircleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.24f, 131.76f),
                    PathNode.CurveTo(166.57962f, 134.10254f, 166.57962f, 137.89746f, 164.24f, 140.24f),
                    PathNode.LineTo(132.24f, 172.24f),
                    PathNode.CurveTo(129.89746f, 174.57962f, 126.10254f, 174.57962f, 123.76f, 172.24f),
                    PathNode.LineTo(91.76f, 140.24f),
                    PathNode.CurveTo(89.55713f, 137.87592f, 89.62213f, 134.19193f, 91.90703f, 131.90703f),
                    PathNode.CurveTo(94.191925f, 129.62213f, 97.87592f, 129.55713f, 100.24f, 131.76f),
                    PathNode.LineTo(122.0f, 153.51f),
                    PathNode.LineTo(122.0f, 88.0f),
                    PathNode.CurveTo(122.0f, 84.686295f, 124.686295f, 82.0f, 128.0f, 82.0f),
                    PathNode.CurveTo(131.3137f, 82.0f, 134.0f, 84.686295f, 134.0f, 88.0f),
                    PathNode.LineTo(134.0f, 153.51f),
                    PathNode.LineTo(155.76f, 131.76f),
                    PathNode.CurveTo(158.10254f, 129.42038f, 161.89746f, 129.42038f, 164.24f, 131.76f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
