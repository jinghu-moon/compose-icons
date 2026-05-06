package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = phosphorBoldIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.65 149.14c1.577 6.434-2.357 12.928-8.79 14.51l-20.67 5.08 5.4 20.16c1.718 6.401-2.079 12.982-8.48 14.7-6.401 1.718-12.982-2.079-14.7-8.48l-7.29-27.2L140 148.78v38.22l20.48 20.48c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L128 209l-15.51 15.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L116 187v-38.22L82.88 167.91l-7.29 27.2c-1.718 6.401-8.299 10.198-14.7 8.48-6.401-1.718-10.198-8.299-8.48-14.7l5.4-20.16L37.14 163.65c-4.262-.929-7.684-4.098-8.937-8.275-1.254-4.178-.142-8.707 2.904-11.829 3.046-3.122 7.546-4.346 11.753-3.196l27.89 6.85L104 128 70.75 108.8l-27.89 6.85c-.935 .233-1.896 .351-2.86 .35-6.062-.014-11.162-4.546-11.887-10.564-.725-6.018 3.152-11.632 9.037-13.086L57.82 87.27 52.42 67.11C50.702 60.709 54.499 54.128 60.9 52.41c6.401-1.718 12.982 2.079 14.7 8.48l7.29 27.2L116 107.21v-38.21L95.52 48.48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L128 47 143.51 31.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L140 69v38.24L173.12 88.12l7.29-27.2c1.718-6.401 8.299-10.198 14.7-8.48 6.401 1.718 10.198 8.299 8.48 14.7l-5.4 20.16 20.67 5.08c5.829 1.501 9.643 7.088 8.92 13.063-.723 5.975-5.761 10.49-11.78 10.557-.967 .001-1.931-.116-2.87-.35l-27.89-6.85L152 128l33.25 19.2 27.89-6.85c6.434-1.577 12.928 2.357 14.51 8.79Z"),
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
