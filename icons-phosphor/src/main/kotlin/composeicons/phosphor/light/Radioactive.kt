package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = phosphorLightIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 134h-52c-3.915-.009-7.646-1.664-10.28-4.56-2.689-2.938-4.018-6.873-3.66-10.84 2.706-29.743 18.336-56.798 42.75-74 3.209-2.269 7.224-3.085 11.064-2.248 3.84 .837 7.152 3.25 9.126 6.648l26 45c1.657 2.872 .672 6.543-2.2 8.2-2.872 1.657-6.543 .672-8.2-2.2L78.62 55c-.278-.488-.749-.836-1.297-.96-.548-.124-1.122-.011-1.583 .31C54.181 69.532 40.382 93.42 38 119.68c-.06 .613 .148 1.222 .57 1.67 .359 .415 .881 .652 1.43 .65h52c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM229.94 118.6c-2.706-29.743-18.336-56.798-42.75-74-3.209-2.269-7.224-3.085-11.064-2.248-3.84 .837-7.152 3.25-9.126 6.648L141 94c-1.657 2.872-.672 6.543 2.2 8.2 2.872 1.657 6.543 .672 8.2-2.2L177.38 55c.278-.488 .749-.836 1.297-.96 .548-.124 1.122-.011 1.583 .31 21.559 15.182 35.358 39.07 37.74 65.33 .06 .613-.148 1.222-.57 1.67-.359 .415-.881 .652-1.43 .65h-52c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h52c3.915-.009 7.646-1.664 10.28-4.56 2.689-2.938 4.018-6.873 3.66-10.84ZM151.2 156.18c-1.051-1.898-3.044-3.082-5.214-3.095-2.17-.013-4.177 1.146-5.25 3.032-1.073 1.886-1.045 4.204 .074 6.063l25.82 44.73c.283 .485 .349 1.068 .182 1.604-.167 .537-.553 .978-1.062 1.216-23.959 11.027-51.541 11.027-75.5 0-.509-.238-.895-.679-1.062-1.216-.167-.537-.101-1.119 .182-1.604l25.82-44.73c1.119-1.859 1.148-4.177 .074-6.063-1.073-1.886-3.081-3.045-5.25-3.032-2.17 .013-4.163 1.196-5.214 3.095L79 200.91c-1.969 3.404-2.415 7.479-1.23 11.228 1.185 3.749 3.892 6.828 7.46 8.482 27.156 12.507 58.424 12.507 85.58 0 3.56-1.662 6.259-4.743 7.436-8.492 1.177-3.749 .725-7.819-1.246-11.218ZM128 138c5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10Z"),
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
