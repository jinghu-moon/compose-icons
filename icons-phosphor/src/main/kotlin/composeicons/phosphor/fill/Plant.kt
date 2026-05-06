package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorFillIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.41 159.07c-9.591 5.83-20.606 8.896-31.83 8.86-9.403-.075-18.699-1.998-27.36-5.66-6.675 9.423-10.247 20.692-10.22 32.24v29.49c.005 2.217-.91 4.336-2.527 5.853-1.617 1.516-3.791 2.294-6.003 2.147-4.265-.371-7.523-3.969-7.47-8.25v-12.44L81.38 172.69c-5.741 2.142-11.813 3.262-17.94 3.31-8.435 .021-16.713-2.287-23.92-6.67C17.73 156.09 6 125.62 8.27 87.79c.237-4.051 3.469-7.283 7.52-7.52 37.83-2.23 68.3 9.46 81.5 31.25 5.186 8.541 7.45 18.538 6.45 28.48-.127 1.574-1.168 2.925-2.657 3.45-1.489 .525-3.147 .125-4.233-1.02L77.65 122.33c-3.145-2.988-8.099-2.925-11.167 .143-3.068 3.068-3.131 8.022-.143 11.167l53.88 55.25c.06-.78 .13-1.56 .21-2.33 1.749-14.833 8.294-28.688 18.64-39.46L189.66 93.64c3.126-3.123 3.128-8.189 .005-11.315-3.123-3.126-8.189-3.128-11.315-.005l-49 51.82c-.999 1.058-2.494 1.49-3.903 1.128-1.409-.362-2.511-1.46-2.877-2.868-4.74-17.48-2.65-34.88 6.4-49.82C146.83 53.1 188.39 37.32 240.15 40.36c4.051 .237 7.283 3.469 7.52 7.52 3 51.77-12.78 93.33-42.26 111.19Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
