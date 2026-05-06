package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorBoldIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 112c0 23.6-8.29 45.23-23.35 60.88C190.52 187.57 171.33 196 152 196c-15.45 0-26.78-4.18-34.89-9.31l-9.43 40.06c-.946 4.211-4.081 7.59-8.21 8.849-4.129 1.258-8.616 .202-11.75-2.766-3.134-2.968-4.432-7.391-3.4-11.582l32-136c.946-4.211 4.081-7.59 8.21-8.849 4.129-1.258 8.616-.202 11.75 2.766 3.134 2.968 4.432 7.391 3.4 11.582l-16.45 69.93C126.72 164.86 135.16 172 152 172c25.56 0 52-22.45 52-60C203.985 83.422 186.104 57.903 159.248 48.133 132.392 38.362 102.293 46.426 83.919 68.314 65.544 90.202 62.816 121.242 77.09 146c3.056 5.709 1.03 12.814-4.577 16.053C66.906 165.293 59.74 163.499 56.32 158 36.987 124.505 40.666 82.495 65.527 52.87 90.387 23.245 131.121 12.331 167.463 25.557 203.805 38.783 227.996 73.326 228 112Z"),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
