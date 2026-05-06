package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = radixIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 .9c3.645 0 6.6 2.956 6.6 6.601-0 3.645-2.955 6.599-6.6 6.6C3.856 14.1 .9 11.146 .9 7.501 .9 3.856 3.855 .9 7.5 .9ZM5.284 10.705c.36 .93 .887 1.773 1.575 2.458 .08 .009 .16 .015 .24 .021v-2.338c-.612-.014-1.222-.062-1.815-.141ZM9.773 10.699c-.611 .083-1.242 .131-1.873 .146v2.339c.081-.006 .162-.012 .242-.021 .713-.686 1.258-1.531 1.631-2.464ZM2.358 9.962c.666 1.388 1.877 2.462 3.355 2.95C5.184 12.214 4.778 11.421 4.496 10.579 3.724 10.433 2.999 10.228 2.358 9.962ZM12.641 9.962c-.623 .259-1.325 .461-2.072 .605-.29 .843-.708 1.636-1.253 2.335 1.465-.492 2.664-1.562 3.325-2.94ZM4.708 7.9c.03 .703 .14 1.398 .327 2.062 .662 .104 1.358 .166 2.063 .183v-2.245h-2.391ZM7.9 10.145c.729-.017 1.449-.082 2.13-.192 .192-.662 .305-1.354 .336-2.053h-2.466v2.245ZM1.815 7.9c.027 .385 .092 .76 .191 1.12 .627 .344 1.406 .611 2.271 .8C4.125 9.193 4.034 8.547 4.008 7.9h-2.193ZM11.067 7.9c-.027 .643-.12 1.283-.274 1.905 .736-.165 1.409-.387 1.976-.666l.224-.118c.1-.361 .166-.735 .192-1.121h-2.117ZM4.327 4.975c-.853 .182-1.625 .443-2.253 .776-.138 .429-.225 .881-.258 1.348h2.192c.029-.718 .134-1.434 .318-2.124ZM7.099 4.662c-.684 .016-1.36 .075-2.003 .173-.224 .725-.354 1.49-.388 2.265h2.391v-2.438ZM7.9 7.099h2.466C10.332 6.328 10.197 5.567 9.967 4.844 9.305 4.74 8.607 4.679 7.9 4.662v2.438ZM10.74 4.989c.188 .686 .298 1.397 .327 2.11h2.117c-.033-.467-.121-.919-.26-1.349l-.156-.082c-.58-.286-1.272-.514-2.028-.68ZM5.713 2.087C4.323 2.545 3.168 3.524 2.482 4.794c.63-.25 1.338-.442 2.086-.579C4.846 3.449 5.227 2.728 5.713 2.087ZM9.316 2.097c.5 .642 .892 1.362 1.178 2.128 .724 .136 1.409 .325 2.021 .567C11.834 3.533 10.693 2.56 9.316 2.097ZM7.9 3.963c.602 .014 1.203 .059 1.788 .136C9.319 3.246 8.804 2.473 8.143 1.837 8.063 1.828 7.981 1.821 7.9 1.815v2.147ZM7.099 1.815c-.081 .006-.161 .013-.241 .021C6.221 2.471 5.723 3.242 5.367 4.091c.567-.072 1.149-.116 1.732-.129v-2.147Z"),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
