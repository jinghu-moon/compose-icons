package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = phosphorThinIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.88 151.05c.521 2.142-.789 4.303-2.93 4.83l-28.6 7L195.86 191c.275 1.025 .131 2.117-.4 3.036-.531 .919-1.405 1.589-2.43 1.864-.325 .093-.662 .14-1 .14-1.819-.006-3.405-1.239-3.86-3L180 162.64 132 134.93v55.41l22.83 22.83c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L128 197.66l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L124 190.34v-55.41L76 162.64 67.86 193c-.455 1.761-2.041 2.994-3.86 3-.338-0-.675-.047-1-.14-1.025-.274-1.899-.945-2.43-1.864-.531-.919-.675-2.011-.4-3.036l7.51-28.05-28.6-7c-2.151-.53-3.465-2.704-2.935-4.855 .53-2.151 2.704-3.465 4.855-2.935l31 7.61L120 128 72 100.27l-31 7.61c-.327 .081-.663 .122-1 .12-2.025 .014-3.741-1.487-3.996-3.496-.255-2.009 1.032-3.892 2.996-4.384l28.6-7L60.14 65c-.362-2.055 .917-4.042 2.936-4.565 2.02-.523 4.102 .594 4.784 2.565L76 93.36l48 27.71v-55.41L101.17 42.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L128 58.34 149.17 37.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L132 65.66v55.41L180 93.36 188.14 63c.682-1.972 2.764-3.089 4.784-2.565 2.02 .523 3.298 2.511 2.936 4.565l-7.51 28.05 28.6 7c2.195 .262 3.762 2.255 3.5 4.45-.262 2.195-2.255 3.762-4.45 3.5-.337 .002-.673-.039-1-.12l-31-7.61L136 128l48 27.73 31-7.61c1.036-.266 2.135-.105 3.052 .445 .917 .551 1.575 1.445 1.828 2.485Z"),
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
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
