package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Recycle: ImageVector
    get() {
        if (_recycle != null) return _recycle!!
        _recycle = phosphorLightIcon(
            name = "Recycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M94 208c0 3.314-2.686 6-6 6h-48c-7.85-.019-15.096-4.219-19.013-11.023C17.07 196.174 17.075 187.799 21 181L57.71 117.56l-18.76 5c-3.203 .856-6.494-1.047-7.35-4.25-.856-3.203 1.047-6.494 4.25-7.35l32.77-8.77c1.544-.421 3.192-.208 4.578 .592 1.386 .8 2.395 2.12 2.802 3.668l8.8 32.76c.412 1.537 .197 3.175-.598 4.553-.795 1.378-2.105 2.384-3.642 2.797-.509 .137-1.033 .208-1.56 .21-2.714-.003-5.089-1.828-5.79-4.45l-5-18.8L31.38 187c-1.783 3.088-1.787 6.891-.01 9.983 1.777 3.091 5.065 5.003 8.63 5.017h48c3.314 0 6 2.686 6 6ZM235 181 211.86 141c-1.725-2.714-5.282-3.585-8.066-1.976-2.784 1.609-3.804 5.127-2.314 7.976l23.14 40c1.783 3.088 1.787 6.891 .01 9.983-1.777 3.091-5.065 5.003-8.63 5.017h-73.52l13.76-13.76c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147l-24 24c-2.34 2.343-2.34 6.137 0 8.48l24 24c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L142.48 214h73.52c7.85-.019 15.096-4.219 19.013-11.023 3.917-6.803 3.912-15.179-.013-21.977ZM136.65 35l36.72 63.44-18.76-5c-3.093-.606-6.128 1.286-6.947 4.329-.819 3.044 .857 6.202 3.837 7.231l32.78 8.79c3.2 .852 6.486-1.05 7.34-4.25l8.79-32.78c.656-2.101 .108-4.393-1.426-5.97-1.534-1.578-3.81-2.189-5.928-1.592-2.119 .597-3.74 2.306-4.225 4.453l-5.05 18.82L147 29C143.057 22.244 135.822 18.091 128 18.091c-7.822 0-15.057 4.154-19 10.909L85.8 69c-1.584 2.862-.583 6.465 2.249 8.101 2.833 1.636 6.454 .701 8.141-2.101L119.35 35c1.789-3.084 5.085-4.982 8.65-4.982 3.565 0 6.861 1.898 8.65 4.982Z"),
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
        return _recycle!!
    }

private var _recycle: ImageVector? = null
