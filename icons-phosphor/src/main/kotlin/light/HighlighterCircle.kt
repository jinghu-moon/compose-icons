package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorLightIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.12f, 55.87f),
                    PathNode.CurveTo(174.42325f, 29.753078f, 136.69305f, 19.42484f, 101.277214f, 28.812836f),
                    PathNode.CurveTo(65.86137f, 38.200832f, 38.201523f, 65.86259f, 28.815983f, 101.27908f),
                    PathNode.CurveTo(19.430443f, 136.69559f, 29.761297f, 174.42508f, 55.88f, 200.12f),
                    PathNode.CurveTo(81.57675f, 226.23692f, 119.30694f, 236.56516f, 154.7228f, 227.17717f),
                    PathNode.CurveTo(190.13864f, 217.78917f, 217.79848f, 190.12741f, 227.18402f, 154.7109f),
                    PathNode.CurveTo(236.56955f, 119.29442f, 226.23871f, 81.56494f, 200.12f, 55.87f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 211.37f),
                    PathNode.LineTo(94.0f, 152.0f),
                    PathNode.CurveTo(94.0f, 150.89543f, 94.89543f, 150.0f, 96.0f, 150.0f),
                    PathNode.LineTo(160.0f, 150.0f),
                    PathNode.CurveTo(161.10457f, 150.0f, 162.0f, 150.89543f, 162.0f, 152.0f),
                    PathNode.LineTo(162.0f, 211.37f),
                    PathNode.CurveTo(140.19533f, 220.21048f, 115.80467f, 220.21048f, 94.0f, 211.37f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 138.0f),
                    PathNode.LineTo(110.0f, 138.0f),
                    PathNode.LineTo(110.0f, 99.71f),
                    PathNode.LineTo(146.0f, 81.71f),
                    PathNode.Close,
                    PathNode.MoveTo(191.64f, 191.64f),
                    PathNode.LineTo(191.64f, 191.64f),
                    PathNode.CurveTo(186.34822f, 196.93178f, 180.42343f, 201.55003f, 174.0f, 205.39f),
                    PathNode.LineTo(174.0f, 152.0f),
                    PathNode.CurveTo(174.0f, 144.26802f, 167.73198f, 138.0f, 160.0f, 138.0f),
                    PathNode.LineTo(158.0f, 138.0f),
                    PathNode.LineTo(158.0f, 72.0f),
                    PathNode.CurveTo(158.00063f, 69.92086f, 156.92484f, 67.98961f, 155.15671f, 66.89574f),
                    PathNode.CurveTo(153.3886f, 65.801865f, 151.1802f, 65.70132f, 149.32f, 66.63f),
                    PathNode.LineTo(101.32f, 90.63f),
                    PathNode.CurveTo(99.28491f, 91.64599f, 97.99932f, 93.725395f, 98.0f, 96.0f),
                    PathNode.LineTo(98.0f, 138.0f),
                    PathNode.LineTo(96.0f, 138.0f),
                    PathNode.CurveTo(88.26801f, 138.0f, 82.0f, 144.26802f, 82.0f, 152.0f),
                    PathNode.LineTo(82.0f, 205.39f),
                    PathNode.CurveTo(75.57658f, 201.55003f, 69.65177f, 196.93178f, 64.36f, 191.64f),
                    PathNode.CurveTo(29.21313f, 156.4927f, 29.213364f, 99.50805f, 64.36052f, 64.36104f),
                    PathNode.CurveTo(99.507675f, 29.214025f, 156.49232f, 29.214025f, 191.63948f, 64.36104f),
                    PathNode.CurveTo(226.78664f, 99.50805f, 226.78687f, 156.4927f, 191.64f, 191.64f),
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
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
