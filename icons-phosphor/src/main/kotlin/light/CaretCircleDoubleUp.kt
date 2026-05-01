package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) return _caretCircleDoubleUp!!
        _caretCircleDoubleUp = phosphorLightIcon(
            name = "CaretCircleDoubleUp",
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
                    PathNode.MoveTo(164.24f, 163.76f),
                    PathNode.CurveTo(165.84523f, 165.25575f, 166.506f, 167.50844f, 165.96309f, 169.63431f),
                    PathNode.CurveTo(165.42018f, 171.76018f, 163.76018f, 173.42018f, 161.63431f, 173.96309f),
                    PathNode.CurveTo(159.50844f, 174.506f, 157.25575f, 173.84523f, 155.76f, 172.24f),
                    PathNode.LineTo(128.0f, 144.49f),
                    PathNode.LineTo(100.24f, 172.24f),
                    PathNode.CurveTo(97.87592f, 174.44287f, 94.191925f, 174.37787f, 91.90703f, 172.09297f),
                    PathNode.CurveTo(89.62213f, 169.80807f, 89.55713f, 166.12408f, 91.76f, 163.76f),
                    PathNode.LineTo(123.76f, 131.76f),
                    PathNode.CurveTo(126.10254f, 129.42038f, 129.89746f, 129.42038f, 132.24f, 131.76f),
                    PathNode.Close,
                    PathNode.MoveTo(164.24f, 107.76f),
                    PathNode.CurveTo(165.84523f, 109.25577f, 166.506f, 111.508446f, 165.96309f, 113.6343f),
                    PathNode.CurveTo(165.42018f, 115.76018f, 163.76018f, 117.42017f, 161.63431f, 117.96308f),
                    PathNode.CurveTo(159.50844f, 118.506f, 157.25575f, 117.84522f, 155.76f, 116.24f),
                    PathNode.LineTo(128.0f, 88.49f),
                    PathNode.LineTo(100.24f, 116.24f),
                    PathNode.CurveTo(97.87592f, 118.44287f, 94.191925f, 118.37787f, 91.90703f, 116.09297f),
                    PathNode.CurveTo(89.62213f, 113.808075f, 89.55713f, 110.12408f, 91.76f, 107.76f),
                    PathNode.LineTo(123.76f, 75.76f),
                    PathNode.CurveTo(126.10254f, 73.42038f, 129.89746f, 73.42038f, 132.24f, 75.76f),
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
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
