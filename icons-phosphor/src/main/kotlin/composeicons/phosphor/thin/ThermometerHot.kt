package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) return _thermometerHot!!
        _thermometerHot = phosphorThinIcon(
            name = "ThermometerHot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 156.29v-108.29c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v108.29c-14.535 2.098-24.98 15.07-23.928 29.718 1.052 14.648 13.242 25.995 27.928 25.995 14.686 0 26.876-11.347 27.928-25.995C148.98 171.36 138.535 158.388 124 156.29ZM120 204c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM156 136v-88C156 28.118 139.882 12 120 12 100.118 12 84 28.118 84 48v88C63.339 151.495 54.912 178.473 63.079 202.974 71.246 227.474 94.174 244 120 244c25.826 0 48.754-16.526 56.921-41.026C185.088 178.473 176.661 151.495 156 136ZM120 236C97.277 236.002 77.184 221.249 70.381 199.569c-6.803-21.681 1.259-45.268 19.909-58.249 1.083-.756 1.723-1.999 1.71-3.32v-90C92 32.536 104.536 20 120 20c15.464 0 28 12.536 28 28v90c-0 1.307 .638 2.532 1.71 3.28 18.687 12.969 26.776 36.579 19.969 58.283C162.871 221.267 142.747 236.027 120 236ZM180.65 78.59c-.581-.89-.783-1.973-.564-3.013 .219-1.039 .843-1.949 1.734-2.527 13.24-8.63 23.07-4.43 31.75-.73 8.15 3.48 14.58 6.22 24.25-.07 1.197-.848 2.762-.973 4.078-.326 1.316 .647 2.173 1.963 2.231 3.429 .059 1.466-.689 2.846-1.95 3.597C236.43 82.7 231.32 84 226.67 84c-6.06 0-11.33-2.25-16.24-4.34-8.15-3.47-14.58-6.22-24.25 .07-1.843 1.208-4.315 .698-5.53-1.14ZM243.35 105.41c.581 .89 .783 1.973 .564 3.013-.219 1.039-.843 1.949-1.734 2.527-5.75 3.75-10.86 5.07-15.51 5.07-6.06 0-11.33-2.25-16.24-4.34-8.15-3.47-14.58-6.22-24.25 .07-1.197 .848-2.762 .973-4.078 .326-1.316-.647-2.173-1.963-2.231-3.429-.059-1.466 .689-2.846 1.95-3.597 13.24-8.63 23.07-4.43 31.75-.73 8.15 3.48 14.58 6.22 24.25-.07 1.848-1.204 4.322-.685 5.53 1.16Z"),
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
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
