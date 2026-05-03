package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorBoldIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 93.0f),
                    PathNode.LineTo(140.0f, 69.2f),
                    PathNode.LineTo(161.83f, 82.29f),
                    PathNode.CurveTo(165.51027f, 84.58813f, 170.14445f, 84.72061f, 173.95f, 82.63648f),
                    PathNode.CurveTo(177.75555f, 80.55235f, 180.13966f, 76.57626f, 180.18529f, 72.23763f),
                    PathNode.CurveTo(180.23088f, 67.89901f, 177.9309f, 63.873672f, 174.17f, 61.71f),
                    PathNode.LineTo(151.32f, 48.0f),
                    PathNode.LineTo(174.17f, 34.29f),
                    PathNode.CurveTo(179.71976f, 30.824478f, 181.47044f, 23.551937f, 178.10574f, 17.94048f),
                    PathNode.CurveTo(174.74106f, 12.329021f, 167.50133f, 10.447233f, 161.83f, 13.71f),
                    PathNode.LineTo(128.0f, 34.0f),
                    PathNode.LineTo(94.17f, 13.71f),
                    PathNode.CurveTo(88.49867f, 10.447233f, 81.25895f, 12.329021f, 77.89425f, 17.94048f),
                    PathNode.CurveTo(74.52956f, 23.551937f, 76.28024f, 30.824478f, 81.83f, 34.29f),
                    PathNode.LineTo(104.68f, 48.0f),
                    PathNode.LineTo(81.83f, 61.71f),
                    PathNode.CurveTo(78.06911f, 63.873672f, 75.76912f, 67.89901f, 75.81473f, 72.23763f),
                    PathNode.CurveTo(75.860344f, 76.57626f, 78.24445f, 80.55235f, 82.049995f, 82.63648f),
                    PathNode.CurveTo(85.855545f, 84.72061f, 90.48973f, 84.58813f, 94.17f, 82.29f),
                    PathNode.LineTo(116.0f, 69.2f),
                    PathNode.LineTo(116.0f, 93.0f),
                    PathNode.CurveTo(76.857735f, 99.25887f, 49.09942f, 134.55057f, 52.238712f, 174.06555f),
                    PathNode.CurveTo(55.378002f, 213.58055f, 88.3605f, 244.04665f, 128.0f, 244.04665f),
                    PathNode.CurveTo(167.63951f, 244.04665f, 200.622f, 213.58055f, 203.76129f, 174.06555f),
                    PathNode.CurveTo(206.90059f, 134.55057f, 179.14226f, 99.25887f, 140.0f, 93.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(99.2812f, 220.0f, 76.0f, 196.71881f, 76.0f, 168.0f),
                    PathNode.CurveTo(76.0f, 139.28119f, 99.2812f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(156.71881f, 116.0f, 180.0f, 139.28119f, 180.0f, 168.0f),
                    PathNode.CurveTo(179.96693f, 196.7051f, 156.7051f, 219.96693f, 128.0f, 220.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
