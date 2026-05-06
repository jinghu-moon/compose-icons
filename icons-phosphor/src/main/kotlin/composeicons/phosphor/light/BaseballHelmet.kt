package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorLightIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 130c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26 14.359 0 26-11.641 26-26 0-14.359-11.641-26-26-26ZM88 170c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM248 122h-26.17C218.644 66.883 172.184 24.305 116.999 25.93 61.814 27.554 17.938 72.791 18 128v24c.044 38.642 31.358 69.956 70 70h40c38.642-.044 69.956-31.358 70-70v-18h50c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM186 152c-.039 32.017-25.983 57.961-58 58h-.85C146.43 196.992 157.991 175.258 158 152v-18h28ZM152 122c-3.314 0-6 2.686-6 6v24c0 32.033-25.967 58-58 58C55.967 210 30 184.033 30 152v-24C29.998 79.462 68.487 39.666 116.998 38.047c48.511-1.619 89.568 35.523 92.802 83.953Z"),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
