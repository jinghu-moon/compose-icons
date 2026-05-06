package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GearFine: ImageVector
    get() {
        if (_gearFine != null) return _gearFine!!
        _gearFine = phosphorThinIcon(
            name = "GearFine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 124h-20.1c-.565-12.025-3.727-23.784-9.27-34.47L220.07 79.46c1.809-1.15 2.39-3.522 1.317-5.377-1.073-1.856-3.418-2.536-5.317-1.543L198.62 82.61C192.101 72.501 183.499 63.899 173.39 57.38L183.46 39.93c.994-1.899 .313-4.244-1.543-5.317-1.856-1.073-4.227-.492-5.377 1.317L166.47 53.37C155.784 47.827 144.025 44.665 132 44.1v-20.1c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20.1c-12.025 .565-23.784 3.727-34.47 9.27L79.46 35.93C78.31 34.121 75.938 33.54 74.083 34.613c-1.856 1.073-2.536 3.418-1.543 5.317L82.61 57.38C72.501 63.899 63.899 72.501 57.38 82.61L39.93 72.54c-1.24-.788-2.812-.833-4.095-.117-1.283 .716-2.07 2.078-2.05 3.547 .02 1.469 .844 2.809 2.146 3.49L53.37 89.53C47.827 100.216 44.665 111.975 44.1 124h-20.1c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20.1c.565 12.025 3.727 23.784 9.27 34.47L35.93 176.54c-1.564 .907-2.325 2.75-1.856 4.496 .468 1.746 2.049 2.961 3.856 2.964 .703 .004 1.394-.183 2-.54L57.38 173.39c6.519 10.109 15.121 18.711 25.23 25.23L72.54 216.07c-1.102 1.911-.449 4.354 1.46 5.46 1.911 1.102 4.354 .449 5.46-1.46L89.53 202.63c10.686 5.543 22.445 8.705 34.47 9.27v20.1c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20.1c12.025-.565 23.784-3.727 34.47-9.27l10.07 17.44c1.15 1.809 3.522 2.39 5.377 1.317 1.856-1.073 2.536-3.418 1.543-5.317L173.39 198.62c10.109-6.519 18.711-15.121 25.23-25.23l17.45 10.07c.606 .357 1.297 .544 2 .54 1.808-.003 3.388-1.218 3.856-2.964 .468-1.746-.293-3.589-1.856-4.496L202.63 166.47c5.543-10.686 8.705-22.445 9.27-34.47h20.1c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM128 52c40.399 .048 73.718 31.659 75.89 72h-73.58L93.53 60.3C104.199 54.84 116.014 51.995 128 52ZM52 128C52.017 102.281 65.04 78.316 86.61 64.31L123.38 128 86.61 191.69C65.04 177.684 52.017 153.719 52 128ZM128 204c-11.986 .005-23.801-2.84-34.47-8.3L130.31 132h73.58c-2.172 40.341-35.491 71.952-75.89 72Z"),
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
        return _gearFine!!
    }

private var _gearFine: ImageVector? = null
