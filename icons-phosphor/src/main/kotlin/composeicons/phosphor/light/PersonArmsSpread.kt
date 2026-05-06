package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorLightIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 70c16.569 0 30-13.431 30-30C158 23.431 144.569 10 128 10 111.431 10 98 23.431 98 40c0 16.569 13.431 30 30 30ZM128 22c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM229.55 88.14C227.859 79.821 220.488 73.883 212 74h-168c-8.452 0-15.765 5.88-17.58 14.135-1.815 8.255 2.358 16.66 10.03 20.205h.1l52.32 23L67.43 212.84c-2.416 5.573-1.859 11.988 1.482 17.06 3.341 5.073 9.014 8.118 15.088 8.1 6.888-.018 13.167-3.95 16.19-10.14L128 180l27.81 47.91c4.33 8.679 14.758 12.367 23.582 8.34 8.824-4.028 12.869-14.322 9.148-23.28L167.1 131.47l52.32-23h.1c7.826-3.453 12.051-12.019 10.03-20.33ZM214.55 97.43l-56.95 25.08c-2.694 1.186-4.13 4.151-3.39 7l22.87 86.93c.1 .342 .224 .676 .37 1 1.4 3.004 .099 6.575-2.905 7.975-3.004 1.4-6.575 .099-7.975-2.905-.07-.165-.15-.325-.24-.48L133.19 165c-1.073-1.85-3.051-2.989-5.19-2.989-2.139 0-4.117 1.139-5.19 2.989L89.69 222.05c-.09 .16-.17 .31-.25 .48-.673 1.449-1.895 2.569-3.397 3.114-1.502 .544-3.158 .467-4.603-.214-1.449-.673-2.569-1.895-3.114-3.397-.544-1.502-.467-3.158 .214-4.603 .146-.324 .27-.658 .37-1l22.87-86.93c.74-2.849-.696-5.814-3.39-7L41.47 97.43C38.931 96.236 37.558 93.443 38.164 90.703 38.771 87.964 41.194 86.01 44 86h168c2.811-.004 5.248 1.945 5.862 4.689 .614 2.743-.758 5.545-3.302 6.741Z"),
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
