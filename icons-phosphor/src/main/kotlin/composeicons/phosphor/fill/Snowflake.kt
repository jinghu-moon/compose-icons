package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = phosphorFillIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM170.37 143.22l18.94-6.76c4.164-1.486 8.744 .686 10.23 4.85 1.486 4.164-.686 8.744-4.85 10.23l-15.48 5.52 4.52 16.87c.55 2.05 .262 4.235-.799 6.073-1.062 1.838-2.81 3.179-4.86 3.727-.676 .178-1.371 .268-2.07 .27-3.622 .001-6.793-2.431-7.73-5.93l-5.57-20.8L136 141.86v30.83l13.66 13.65c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L128 187.31l-10.34 10.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L120 172.69v-30.83L93.3 157.27l-5.57 20.8c-.937 3.499-4.108 5.931-7.73 5.93-.699-.002-1.394-.092-2.07-.27-2.05-.548-3.799-1.889-4.86-3.727-1.062-1.838-1.349-4.023-.8-6.073l4.52-16.87L61.31 151.54c-4.164-1.486-6.336-6.066-4.85-10.23 1.486-4.164 6.066-6.336 10.23-4.85l18.94 6.76L112 128 85.63 112.78l-18.94 6.76c-.865 .303-1.774 .458-2.69 .46-3.898 .008-7.234-2.795-7.899-6.635-.665-3.841 1.535-7.602 5.209-8.905L76.79 98.94 72.27 82.07c-1.143-4.269 1.391-8.657 5.66-9.8 4.269-1.143 8.657 1.391 9.8 5.66l5.57 20.8L120 114.14v-30.83L106.34 69.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L128 68.69 138.34 58.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L136 83.31v30.83L162.7 98.73l5.57-20.8c1.143-4.269 5.531-6.803 9.8-5.66 4.269 1.143 6.803 5.531 5.66 9.8l-4.52 16.87 15.48 5.52c3.674 1.303 5.874 5.064 5.209 8.905-.665 3.841-4.001 6.643-7.899 6.635-.916-.002-1.825-.157-2.69-.46l-18.94-6.76L144 128Z"),
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
