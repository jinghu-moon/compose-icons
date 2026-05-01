package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorLightIcon(
            name = "CaretCircleUpDown",
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
                    PathNode.MoveTo(164.24f, 99.76f),
                    PathNode.CurveTo(165.84523f, 101.25577f, 166.506f, 103.508446f, 165.96309f, 105.6343f),
                    PathNode.CurveTo(165.42018f, 107.76018f, 163.76018f, 109.42017f, 161.63431f, 109.96308f),
                    PathNode.CurveTo(159.50844f, 110.506f, 157.25575f, 109.84522f, 155.76f, 108.24f),
                    PathNode.LineTo(128.0f, 80.49f),
                    PathNode.LineTo(100.24f, 108.24f),
                    PathNode.CurveTo(97.87592f, 110.44287f, 94.191925f, 110.37787f, 91.90703f, 108.09297f),
                    PathNode.CurveTo(89.62213f, 105.808075f, 89.55713f, 102.12408f, 91.76f, 99.76f),
                    PathNode.LineTo(123.76f, 67.76f),
                    PathNode.CurveTo(126.10254f, 65.42037f, 129.89746f, 65.42037f, 132.24f, 67.76f),
                    PathNode.Close,
                    PathNode.MoveTo(164.24f, 147.76f),
                    PathNode.CurveTo(166.57962f, 150.10254f, 166.57962f, 153.89746f, 164.24f, 156.24f),
                    PathNode.LineTo(132.24f, 188.24f),
                    PathNode.CurveTo(129.89746f, 190.57962f, 126.10254f, 190.57962f, 123.76f, 188.24f),
                    PathNode.LineTo(91.76f, 156.24f),
                    PathNode.CurveTo(89.55713f, 153.87592f, 89.62213f, 150.19193f, 91.90703f, 147.90703f),
                    PathNode.CurveTo(94.191925f, 145.62213f, 97.87592f, 145.55713f, 100.24f, 147.76f),
                    PathNode.LineTo(128.0f, 175.51f),
                    PathNode.LineTo(155.76f, 147.76f),
                    PathNode.CurveTo(158.10254f, 145.42038f, 161.89746f, 145.42038f, 164.24f, 147.76f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null
