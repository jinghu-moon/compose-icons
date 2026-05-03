package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorLightIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(95.31f, 101.2f),
                    PathNode.CurveTo(104.16933f, 117.96842f, 104.16933f, 138.03157f, 95.31f, 154.8f),
                    PathNode.CurveTo(93.7636f, 157.73264f, 90.13263f, 158.8564f, 87.2f, 157.31f),
                    PathNode.CurveTo(84.267365f, 155.7636f, 83.1436f, 152.13263f, 84.69f, 149.2f),
                    PathNode.CurveTo(91.81043f, 135.96349f, 91.81043f, 120.03651f, 84.69f, 106.8f),
                    PathNode.CurveTo(83.1436f, 103.86737f, 84.267365f, 100.2364f, 87.2f, 98.69f),
                    PathNode.CurveTo(90.13263f, 97.1436f, 93.7636f, 98.267365f, 95.31f, 101.2f),
                    PathNode.Close,
                    PathNode.MoveTo(143.17f, 66.71f),
                    PathNode.CurveTo(140.24869f, 68.273186f, 139.14738f, 71.90838f, 140.71f, 74.83f),
                    PathNode.CurveTo(158.48975f, 108.04713f, 158.48975f, 147.95288f, 140.71f, 181.17f),
                    PathNode.CurveTo(139.66293f, 183.06328f, 139.71625f, 185.37366f, 140.84952f, 187.21663f),
                    PathNode.CurveTo(141.9828f, 189.0596f, 144.02052f, 190.14973f, 146.18257f, 190.06966f),
                    PathNode.CurveTo(148.34462f, 189.9896f, 150.29613f, 188.75174f, 151.29f, 186.83f),
                    PathNode.CurveTo(170.96489f, 150.0775f, 170.96489f, 105.9225f, 151.29f, 69.17f),
                    PathNode.CurveTo(149.7268f, 66.24868f, 146.09161f, 65.147385f, 143.17f, 66.71f),
                    PathNode.Close,
                    PathNode.MoveTo(115.17f, 82.71f),
                    PathNode.CurveTo(113.76366f, 83.457214f, 112.71207f, 84.73288f, 112.246895f, 86.25595f),
                    PathNode.CurveTo(111.781715f, 87.779015f, 111.94112f, 89.42454f, 112.69f, 90.83f),
                    PathNode.CurveTo(125.08466f, 114.06717f, 125.08466f, 141.95284f, 112.69f, 165.19f),
                    PathNode.CurveTo(111.13256f, 168.11711f, 112.24289f, 171.75256f, 115.17f, 173.31f),
                    PathNode.CurveTo(118.09711f, 174.86745f, 121.73256f, 173.75711f, 123.29f, 170.83f),
                    PathNode.CurveTo(137.562f, 144.06717f, 137.562f, 111.952835f, 123.29f, 85.19f),
                    PathNode.CurveTo(121.73764f, 82.26343f, 118.10718f, 81.148766f, 115.18f, 82.7f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 184.33304f, 184.33304f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(71.666954f, 230.0f, 26.0f, 184.33304f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 71.666954f, 71.666954f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(184.30563f, 26.066126f, 229.93387f, 71.69437f, 230.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 78.29437f, 177.70563f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(78.29437f, 38.0f, 38.0f, 78.29437f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 177.70563f, 78.29437f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(177.68279f, 217.94489f, 217.94489f, 177.68279f, 218.0f, 128.0f),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
