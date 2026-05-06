package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) return _externalLink!!
        _externalLink = radixIcon(
            name = "ExternalLink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.5 2C6.776 2 7 2.224 7 2.5 7 2.776 6.776 3 6.5 3h-3.5v9h9v-3.5C12 8.224 12.224 8 12.5 8c.276 0 .5 .224 .5 .5v3.5c0 .552-.448 1-1 1h-9C2.448 13 2 12.552 2 12v-9C2 2.448 2.448 2 3 2h3.5ZM12.5 2c.033 0 .066 .002 .098 .009l.003 .001c.059 .012 .114 .036 .163 .066 .012 .008 .024 .017 .035 .025 .014 .011 .029 .022 .042 .034 .004 .004 .009 .007 .013 .011 .004 .004 .007 .01 .012 .015 .013 .014 .025 .029 .036 .044 .008 .011 .016 .022 .023 .034 .01 .017 .019 .035 .027 .053 .004 .008 .008 .016 .012 .024 .008 .02 .014 .041 .02 .062 .002 .01 .006 .02 .008 .03 .005 .029 .009 .06 .009 .091v3C13 5.776 12.776 6 12.5 6 12.224 6 12 5.776 12 5.5v-1.793L6.854 8.854c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L11.293 3h-1.793C9.224 3 9 2.776 9 2.5 9 2.224 9.224 2 9.5 2h3Z"),
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
        return _externalLink!!
    }

private var _externalLink: ImageVector? = null
