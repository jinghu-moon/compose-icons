package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorFillIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 80h-32.56c14.481 25.091 10.301 56.781-10.19 77.26-8.52 8.69-19.61 16.92-31.85 24.51-1.577 .96-3.606 .716-4.91-.59L117.65 146.34c-1.531-1.532-3.618-2.377-5.783-2.343-2.165 .034-4.225 .944-5.707 2.523-2.933 3.291-2.752 8.309 .41 11.38l29.88 29.88c.905 .904 1.324 2.186 1.126 3.449-.198 1.264-.988 2.357-2.126 2.941C95.74 214.79 53 228.54 46.78 230.48c-6.095 2.84-13.316 1.565-18.07-3.19-4.755-4.755-6.029-11.975-3.19-18.07 2.73-8.71 29-90.27 64.86-133.35 .721-.862 1.77-1.381 2.893-1.43 1.122-.049 2.214 .375 3.007 1.17l42.05 42.06c1.572 1.571 3.727 2.418 5.949 2.336 2.221-.082 4.309-1.084 5.761-2.766 2.726-3.29 2.465-8.123-.6-11.1L108.08 64.78c-.854-.851-1.279-2.041-1.157-3.24 .122-1.199 .779-2.279 1.787-2.94 20.237-13.358 46.285-14.133 67.28-2v-32.6c-.005-2.219 .911-4.34 2.531-5.857 1.619-1.517 3.796-2.293 6.009-2.143 4.277 .372 7.539 3.987 7.47 8.28v28.41L218.34 26.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L203.31 64h28.41c4.293-.069 7.908 3.193 8.28 7.47 .147 2.212-.631 4.386-2.147 6.003C236.336 79.09 234.217 80.005 232 80Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
