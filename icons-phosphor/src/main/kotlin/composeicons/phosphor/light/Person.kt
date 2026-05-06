package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = phosphorLightIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 70c16.569 0 30-13.431 30-30C158 23.431 144.569 10 128 10 111.431 10 98 23.431 98 40c0 16.569 13.431 30 30 30ZM128 22c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM216.88 135.42 171.67 84.16C165.976 77.701 157.781 74.001 149.17 74h-42.34C98.221 73.998 90.026 77.695 84.33 84.15L39.12 135.42c-7.064 6.997-7.117 18.396-.12 25.46 6.997 7.064 18.396 7.117 25.46 .12L85.57 144.07 67.44 212.92c-3.966 9.013 .046 19.54 9.005 23.626 8.959 4.087 19.539 .216 23.745-8.686L128 180l27.81 47.91c4.207 8.903 14.787 12.773 23.745 8.686 8.959-4.087 12.971-14.614 9.005-23.626L170.43 144.1 191.54 161c7.098 6.748 18.289 6.582 25.185-.373 6.895-6.955 6.964-18.147 .155-25.187ZM208.25 152.24c-1.125 1.127-2.653 1.76-4.245 1.76-1.592 0-3.12-.633-4.245-1.76-.151-.159-.315-.307-.49-.44L163.76 123.32c-2.019-1.62-4.849-1.764-7.021-.355-2.172 1.409-3.195 4.051-2.539 6.555l22.87 86.93c.1 .342 .224 .676 .37 1 1.4 3.004 .099 6.575-2.905 7.975-3.004 1.4-6.575 .099-7.975-2.905-.073-.165-.157-.325-.25-.48L133.19 165c-1.073-1.85-3.051-2.989-5.19-2.989-2.139 0-4.117 1.139-5.19 2.989L89.69 222.05c-.093 .155-.177 .315-.25 .48-1.4 3.004-4.971 4.305-7.975 2.905-3.004-1.4-4.305-4.971-2.905-7.975 .146-.324 .27-.658 .37-1l22.87-86.93c.646-2.494-.372-5.122-2.53-6.53-.972-.64-2.107-.987-3.27-1-1.367-.001-2.694 .464-3.76 1.32L56.73 151.8c-.175 .133-.339 .281-.49 .44-2.344 2.344-6.146 2.344-8.49 0-2.344-2.344-2.344-6.146 0-8.49l.26-.27L93.33 92.09c3.418-3.873 8.335-6.091 13.5-6.09h42.34c5.165-.001 10.082 2.217 13.5 6.09L208 143.48l.26 .27c1.125 1.127 1.757 2.655 1.755 4.247-.002 1.592-.637 3.119-1.765 4.243Z"),
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
        return _person!!
    }

private var _person: ImageVector? = null
