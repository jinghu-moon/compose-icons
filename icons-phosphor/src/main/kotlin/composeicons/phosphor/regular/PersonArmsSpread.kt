package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorRegularIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 40C160 22.327 145.673 8 128 8 110.327 8 96 22.327 96 40c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32ZM128 56c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM231.5 87.71C229.621 78.467 221.431 71.869 212 72h-168C34.607 72 26.48 78.536 24.465 87.71c-2.015 9.174 2.626 18.514 11.155 22.45h.13l50.75 22.35-21 79.72c-4.576 10.079-.114 21.959 9.965 26.535 10.079 4.576 21.959 .114 26.535-9.965l26-44.87 26 44.87c4.802 9.631 16.364 13.735 26.164 9.288 9.8-4.448 14.323-15.852 10.236-25.808l-21-79.72 50.75-22.35h.13c8.68-3.81 13.4-13.275 11.22-22.5ZM213.7 95.61l-56.93 25.06c-3.6 1.586-5.513 5.555-4.51 9.36L175.13 217c.117 .466 .281 .918 .49 1.35 .686 1.468 .419 3.205-.676 4.398-1.095 1.194-2.803 1.609-4.324 1.052-.995-.365-1.804-1.109-2.25-2.07-.101-.216-.215-.427-.34-.63L134.92 164c-1.431-2.467-4.068-3.986-6.92-3.986-2.852 0-5.489 1.519-6.92 3.986L88 221.05c-.125 .203-.239 .414-.34 .63-.446 .961-1.255 1.705-2.25 2.07-1.521 .558-3.229 .142-4.324-1.052-1.095-1.194-1.362-2.931-.676-4.398 .209-.432 .373-.884 .49-1.35L103.74 130c1.003-3.805-.91-7.774-4.51-9.36L42.3 95.61c-1.683-.803-2.588-2.662-2.181-4.482C40.525 89.308 42.135 88.011 44 88h168c1.87-.003 3.493 1.29 3.908 3.113 .415 1.824-.49 3.691-2.178 4.497Z"),
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
