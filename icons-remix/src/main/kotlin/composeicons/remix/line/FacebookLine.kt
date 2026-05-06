package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FacebookLine: ImageVector
    get() {
        if (_facebookLine != null) return _facebookLine!!
        _facebookLine = remixIcon(
            name = "FacebookLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 9h4.5L17 11h-4v9h-2v-9h-4v-2h4v-1.872c0-1.783 .186-2.43 .534-3.081 .349-.652 .86-1.163 1.512-1.512C13.698 2.186 14.345 2 16.128 2c.522 0 .979 .05 1.372 .15v1.85h-1.372c-1.324 0-1.727 .078-2.138 .298-.303 .162-.529 .388-.692 .692C13.078 5.401 13 5.804 13 7.128v1.872Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _facebookLine!!
    }

private var _facebookLine: ImageVector? = null
