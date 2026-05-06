package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = phosphorRegularIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.77 150.09c.507 2.061 .174 4.238-.925 6.054-1.099 1.815-2.874 3.12-4.935 3.626l-24.64 6 6.46 24.11c.55 2.05 .262 4.235-.799 6.073-1.062 1.838-2.81 3.179-4.86 3.727-.674 .194-1.369 .302-2.07 .32-3.618-.003-6.784-2.435-7.72-5.93l-7.72-28.8L136 141.86v46.83l21.66 21.65c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L128 203.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L120 188.69v-46.83L79.45 165.27l-7.72 28.8c-.937 3.499-4.108 5.931-7.73 5.93-.702-.001-1.401-.092-2.08-.27-2.05-.548-3.799-1.889-4.86-3.727-1.062-1.838-1.349-4.023-.8-6.073l6.46-24.11-24.64-6c-4.291-1.055-6.915-5.389-5.86-9.68 1.055-4.291 5.389-6.915 9.68-5.86l29.45 7.23L112 128 71.36 104.54l-29.45 7.23c-.625 .155-1.266 .232-1.91 .23-4.048 .003-7.461-3.019-7.947-7.038-.487-4.019 2.106-7.768 6.037-8.732l24.64-6L56.27 66.07c-1.143-4.269 1.391-8.657 5.66-9.8 4.269-1.143 8.657 1.391 9.8 5.66l7.72 28.8L120 114.14v-46.83L98.34 45.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L128 52.69 146.34 34.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L136 67.31v46.83L176.55 90.73l7.72-28.8c1.143-4.269 5.531-6.803 9.8-5.66 4.269 1.143 6.803 5.531 5.66 9.8l-6.46 24.11 24.64 6c4.048 .864 6.768 4.673 6.271 8.782-.496 4.109-4.044 7.161-8.182 7.038-.644 .002-1.285-.075-1.91-.23l-29.45-7.23L144 128l40.64 23.46 29.45-7.23c2.061-.507 4.238-.174 6.054 .925 1.815 1.099 3.12 2.874 3.626 4.935Z"),
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
