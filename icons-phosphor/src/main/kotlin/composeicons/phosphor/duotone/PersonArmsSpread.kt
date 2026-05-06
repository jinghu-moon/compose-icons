package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorDuotoneIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 40c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C114.745 64 104 53.255 104 40ZM212 80h-168C31.13 80 27.29 97.5 39 102.9L96 128 73.13 214.93c-2.687 5.985-.069 13.018 5.877 15.791 5.946 2.772 13.016 .255 15.873-5.65L128 168l33.12 57.07c2.857 5.906 9.927 8.423 15.873 5.65 5.946-2.772 8.564-9.805 5.877-15.791L160 128l57-25.1C228.69 97.5 224.85 80 212 80Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M160 40C160 22.327 145.673 8 128 8 110.327 8 96 22.327 96 40c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32ZM128 56c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM231.5 87.71C229.621 78.467 221.431 71.869 212 72h-168C34.607 72 26.48 78.536 24.465 87.71c-2.015 9.174 2.626 18.514 11.155 22.45l.13 .06 50.75 22.35-21 79.72c-4.565 10.079-.094 21.95 9.985 26.515 10.079 4.565 21.95 .094 26.515-9.985l26-44.88 26 44.88c4.786 9.664 16.373 13.794 26.192 9.335 9.82-4.459 14.335-15.901 10.208-25.865l-21-79.72 50.75-22.35 .13-.06c8.66-3.803 13.377-13.241 11.22-22.45ZM213.7 95.61l-56.93 25.07c-3.6 1.586-5.513 5.555-4.51 9.36L175.13 217c.117 .466 .281 .918 .49 1.35 .628 1.299 .508 2.835-.313 4.021-.822 1.186-2.219 1.837-3.655 1.704-1.437-.133-2.69-1.029-3.281-2.345-.11-.22-.22-.43-.34-.63L134.92 164c-1.431-2.467-4.068-3.986-6.92-3.986-2.852 0-5.489 1.519-6.92 3.986L88 221.06c-.12 .2-.23 .41-.34 .63-.591 1.316-1.845 2.212-3.281 2.345-1.437 .133-2.833-.518-3.655-1.704-.822-1.186-.942-2.722-.313-4.021 .209-.432 .373-.884 .49-1.35L103.74 130c1.003-3.805-.91-7.774-4.51-9.36L42.3 95.61c-1.683-.803-2.588-2.662-2.181-4.482C40.525 89.308 42.135 88.011 44 88h168c1.87-.003 3.493 1.29 3.908 3.113 .415 1.824-.49 3.691-2.178 4.497Z"),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
