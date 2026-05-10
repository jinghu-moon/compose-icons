package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorFillIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.66 77.6c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L208 59.25 179.3 88l34.35 34.35c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L196 127.27l-84 84c-3.002 3.026-7.088 4.728-11.35 4.73h-49.39L29.6 237.66c-1.573 1.575-3.73 2.423-5.954 2.341-2.224-.082-4.313-1.086-5.766-2.771-2.714-3.296-2.448-8.121 .61-11.1L39.94 204.67v-49.39c.01-4.232 1.696-8.288 4.69-11.28L59.81 128.82c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l28.83 28.81c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L76.78 117.47c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83l11-11c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l28.84 28.84c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L104.79 89.46c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83L128.66 59.94l-6.35-6.35c-1.532-1.531-2.377-3.618-2.343-5.783 .034-2.165 .944-4.225 2.523-5.707 3.288-2.932 8.302-2.751 11.37 .41L168 76.63 196.69 47.93 178.33 29.58c-1.533-1.53-2.38-3.616-2.348-5.781 .032-2.165 .941-4.225 2.518-5.709 3.291-2.933 8.309-2.752 11.38 .41l47.78 47.78c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66Z"),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
