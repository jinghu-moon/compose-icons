package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyCircleDollar: ImageVector
    get() {
        if (_currencyCircleDollar != null) return _currencyCircleDollar!!
        _currencyCircleDollar = phosphorLightIcon(
            name = "CurrencyCircleDollar",
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
                    PathNode.MoveTo(166.0f, 148.0f),
                    PathNode.CurveTo(166.0f, 162.3594f, 154.3594f, 174.0f, 140.0f, 174.0f),
                    PathNode.LineTo(134.0f, 174.0f),
                    PathNode.LineTo(134.0f, 184.0f),
                    PathNode.CurveTo(134.0f, 187.3137f, 131.3137f, 190.0f, 128.0f, 190.0f),
                    PathNode.CurveTo(124.686295f, 190.0f, 122.0f, 187.3137f, 122.0f, 184.0f),
                    PathNode.LineTo(122.0f, 174.0f),
                    PathNode.LineTo(104.0f, 174.0f),
                    PathNode.CurveTo(100.686295f, 174.0f, 98.0f, 171.3137f, 98.0f, 168.0f),
                    PathNode.CurveTo(98.0f, 164.6863f, 100.686295f, 162.0f, 104.0f, 162.0f),
                    PathNode.LineTo(140.0f, 162.0f),
                    PathNode.CurveTo(147.73198f, 162.0f, 154.0f, 155.73198f, 154.0f, 148.0f),
                    PathNode.CurveTo(154.0f, 140.26802f, 147.73198f, 134.0f, 140.0f, 134.0f),
                    PathNode.LineTo(116.0f, 134.0f),
                    PathNode.CurveTo(101.640594f, 134.0f, 90.0f, 122.359406f, 90.0f, 108.0f),
                    PathNode.CurveTo(90.0f, 93.640594f, 101.640594f, 82.0f, 116.0f, 82.0f),
                    PathNode.LineTo(122.0f, 82.0f),
                    PathNode.LineTo(122.0f, 72.0f),
                    PathNode.CurveTo(122.0f, 68.686295f, 124.686295f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(131.3137f, 66.0f, 134.0f, 68.686295f, 134.0f, 72.0f),
                    PathNode.LineTo(134.0f, 82.0f),
                    PathNode.LineTo(152.0f, 82.0f),
                    PathNode.CurveTo(155.3137f, 82.0f, 158.0f, 84.686295f, 158.0f, 88.0f),
                    PathNode.CurveTo(158.0f, 91.313705f, 155.3137f, 94.0f, 152.0f, 94.0f),
                    PathNode.LineTo(116.0f, 94.0f),
                    PathNode.CurveTo(108.26801f, 94.0f, 102.0f, 100.26801f, 102.0f, 108.0f),
                    PathNode.CurveTo(102.0f, 115.73199f, 108.26801f, 122.0f, 116.0f, 122.0f),
                    PathNode.LineTo(140.0f, 122.0f),
                    PathNode.CurveTo(154.3594f, 122.0f, 166.0f, 133.6406f, 166.0f, 148.0f),
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
        return _currencyCircleDollar!!
    }

private var _currencyCircleDollar: ImageVector? = null
