package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorLightIcon(
            name = "CaretCircleDoubleRight",
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
                    PathNode.MoveTo(124.24f, 123.76f),
                    PathNode.CurveTo(126.57962f, 126.10254f, 126.57962f, 129.89746f, 124.24f, 132.24f),
                    PathNode.LineTo(92.24f, 164.24f),
                    PathNode.CurveTo(89.87592f, 166.44287f, 86.191925f, 166.37787f, 83.90703f, 164.09297f),
                    PathNode.CurveTo(81.62213f, 161.80807f, 81.55713f, 158.12408f, 83.76f, 155.76f),
                    PathNode.LineTo(111.51f, 128.0f),
                    PathNode.LineTo(83.76f, 100.24f),
                    PathNode.CurveTo(81.55713f, 97.87592f, 81.62213f, 94.191925f, 83.90703f, 91.90703f),
                    PathNode.CurveTo(86.191925f, 89.62213f, 89.87592f, 89.55713f, 92.24f, 91.76f),
                    PathNode.Close,
                    PathNode.MoveTo(180.24f, 123.76f),
                    PathNode.CurveTo(182.57962f, 126.10254f, 182.57962f, 129.89746f, 180.24f, 132.24f),
                    PathNode.LineTo(148.24f, 164.24f),
                    PathNode.CurveTo(145.87592f, 166.44287f, 142.19193f, 166.37787f, 139.90703f, 164.09297f),
                    PathNode.CurveTo(137.62213f, 161.80807f, 137.55713f, 158.12408f, 139.76f, 155.76f),
                    PathNode.LineTo(167.51f, 128.0f),
                    PathNode.LineTo(139.76f, 100.24f),
                    PathNode.CurveTo(137.55713f, 97.87592f, 137.62213f, 94.191925f, 139.90703f, 91.90703f),
                    PathNode.CurveTo(142.19193f, 89.62213f, 145.87592f, 89.55713f, 148.24f, 91.76f),
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
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
