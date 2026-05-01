package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorLightIcon(
            name = "CaretCircleDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.12f, 55.87f),
                    PathNode.CurveTo(160.28647f, 16.036463f, 95.70354f, 16.036463f, 55.87f, 55.87f),
                    PathNode.CurveTo(16.036463f, 95.70354f, 16.036463f, 160.28647f, 55.87f, 200.12f),
                    PathNode.CurveTo(95.70354f, 239.95354f, 160.28647f, 239.95354f, 200.12f, 200.12f),
                    PathNode.CurveTo(239.95354f, 160.28647f, 239.95354f, 95.70354f, 200.12f, 55.87f),
                    PathNode.Close,
                    PathNode.MoveTo(191.64f, 191.64f),
                    PathNode.CurveTo(156.4927f, 226.78687f, 99.50805f, 226.78664f, 64.36104f, 191.63948f),
                    PathNode.CurveTo(29.214025f, 156.49232f, 29.214025f, 99.507675f, 64.36104f, 64.36052f),
                    PathNode.CurveTo(99.50805f, 29.213364f, 156.4927f, 29.21313f, 191.64f, 64.36f),
                    PathNode.CurveTo(226.73257f, 99.53009f, 226.73257f, 156.46991f, 191.64f, 191.64f),
                    PathNode.Close,
                    PathNode.MoveTo(164.24f, 83.76f),
                    PathNode.CurveTo(166.57962f, 86.10254f, 166.57962f, 89.89746f, 164.24f, 92.24f),
                    PathNode.LineTo(132.24f, 124.24f),
                    PathNode.CurveTo(129.89746f, 126.57962f, 126.10254f, 126.57962f, 123.76f, 124.24f),
                    PathNode.LineTo(91.76f, 92.24f),
                    PathNode.CurveTo(89.55713f, 89.87592f, 89.62213f, 86.191925f, 91.90703f, 83.90703f),
                    PathNode.CurveTo(94.191925f, 81.62213f, 97.87592f, 81.55713f, 100.24f, 83.76f),
                    PathNode.LineTo(128.0f, 111.51f),
                    PathNode.LineTo(155.76f, 83.76f),
                    PathNode.CurveTo(158.10254f, 81.42038f, 161.89746f, 81.42038f, 164.24f, 83.76f),
                    PathNode.Close,
                    PathNode.MoveTo(164.24f, 139.76f),
                    PathNode.CurveTo(166.57962f, 142.10254f, 166.57962f, 145.89746f, 164.24f, 148.24f),
                    PathNode.LineTo(132.24f, 180.24f),
                    PathNode.CurveTo(129.89746f, 182.57962f, 126.10254f, 182.57962f, 123.76f, 180.24f),
                    PathNode.LineTo(91.76f, 148.24f),
                    PathNode.CurveTo(89.55713f, 145.87592f, 89.62213f, 142.19193f, 91.90703f, 139.90703f),
                    PathNode.CurveTo(94.191925f, 137.62213f, 97.87592f, 137.55713f, 100.24f, 139.76f),
                    PathNode.LineTo(128.0f, 167.51f),
                    PathNode.LineTo(155.76f, 139.76f),
                    PathNode.CurveTo(158.10254f, 137.42038f, 161.89746f, 137.42038f, 164.24f, 139.76f),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
