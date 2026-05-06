package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = phosphorLightIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.83 150.57c.38 1.546 .13 3.18-.695 4.542-.825 1.362-2.158 2.34-3.705 2.718l-26.62 6.54 7 26.08c.412 1.537 .197 3.175-.598 4.553-.795 1.378-2.105 2.384-3.642 2.797-.507 .13-1.027 .197-1.55 .2-2.718 .002-5.098-1.824-5.8-4.45L178.27 164 134 138.39v51.13l22.24 22.24c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L128 200.49l-19.76 19.75c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L122 189.52v-51.13L77.73 164l-7.93 29.6c-.721 2.606-3.096 4.408-5.8 4.4-.523-.003-1.043-.07-1.55-.2-1.537-.412-2.847-1.418-3.642-2.797-.795-1.378-1.01-3.016-.598-4.553l7-26.08L38.59 157.83c-3.22-.79-5.19-4.04-4.4-7.26 .79-3.22 4.04-5.19 7.26-4.4l30.23 7.43L116 128 71.66 102.4l-30.23 7.43c-.468 .115-.948 .172-1.43 .17-3.04 .006-5.604-2.262-5.969-5.28-.365-3.018 1.585-5.832 4.539-6.55L65.19 91.63 58.19 65.55c-.605-2.087-.034-4.339 1.493-5.885 1.527-1.547 3.77-2.147 5.865-1.569 2.095 .578 3.714 2.244 4.232 4.354l7.93 29.6L122 117.61v-51.13L99.76 44.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L128 55.51 147.76 35.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L134 66.48v51.13L178.27 92.05l7.93-29.6c.518-2.111 2.137-3.776 4.232-4.354 2.095-.578 4.339 .022 5.865 1.569 1.527 1.547 2.098 3.798 1.493 5.885l-7 26.08 26.62 6.54c2.95 .718 4.899 3.526 4.54 6.54-.359 3.015-2.914 5.286-5.95 5.29-.482 .002-.962-.055-1.43-.17l-30.23-7.43L140 128l44.34 25.6 30.23-7.43c1.546-.38 3.18-.13 4.542 .695 1.362 .825 2.34 2.158 2.718 3.705Z"),
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
