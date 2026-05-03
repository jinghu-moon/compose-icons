package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorLightIcon(
            name = "CaretCircleDoubleLeft",
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
                    PathNode.MoveTo(172.24f, 100.24f),
                    PathNode.LineTo(144.49f, 128.0f),
                    PathNode.LineTo(172.24f, 155.76f),
                    PathNode.CurveTo(173.84523f, 157.25575f, 174.506f, 159.50844f, 173.96309f, 161.63431f),
                    PathNode.CurveTo(173.42018f, 163.76018f, 171.76018f, 165.42018f, 169.63431f, 165.96309f),
                    PathNode.CurveTo(167.50844f, 166.506f, 165.25575f, 165.84523f, 163.76f, 164.24f),
                    PathNode.LineTo(131.76f, 132.24f),
                    PathNode.CurveTo(129.42038f, 129.89746f, 129.42038f, 126.10254f, 131.76f, 123.76f),
                    PathNode.LineTo(163.76f, 91.76f),
                    PathNode.CurveTo(166.12408f, 89.55713f, 169.80807f, 89.62213f, 172.09297f, 91.90703f),
                    PathNode.CurveTo(174.37787f, 94.191925f, 174.44287f, 97.87592f, 172.24f, 100.24f),
                    PathNode.Close,
                    PathNode.MoveTo(116.24f, 100.24f),
                    PathNode.LineTo(88.49f, 128.0f),
                    PathNode.LineTo(116.24f, 155.76f),
                    PathNode.CurveTo(117.84522f, 157.25575f, 118.506f, 159.50844f, 117.96308f, 161.63431f),
                    PathNode.CurveTo(117.42017f, 163.76018f, 115.76018f, 165.42018f, 113.6343f, 165.96309f),
                    PathNode.CurveTo(111.508446f, 166.506f, 109.25577f, 165.84523f, 107.76f, 164.24f),
                    PathNode.LineTo(75.76f, 132.24f),
                    PathNode.CurveTo(73.42038f, 129.89746f, 73.42038f, 126.10254f, 75.76f, 123.76f),
                    PathNode.LineTo(107.76f, 91.76f),
                    PathNode.CurveTo(110.12408f, 89.55713f, 113.808075f, 89.62213f, 116.09297f, 91.90703f),
                    PathNode.CurveTo(118.37787f, 94.191925f, 118.44287f, 97.87592f, 116.24f, 100.24f),
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
        return _caretCircleDoubleLeft!!
    }

private var _caretCircleDoubleLeft: ImageVector? = null
