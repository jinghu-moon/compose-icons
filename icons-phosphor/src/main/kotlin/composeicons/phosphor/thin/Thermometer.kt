package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorThinIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 60c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24C236 70.745 225.255 60 212 60ZM212 100c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM124 156.29v-68.29c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v68.29c-14.535 2.098-24.98 15.07-23.928 29.718 1.052 14.648 13.242 25.995 27.928 25.995 14.686 0 26.876-11.347 27.928-25.995C148.98 171.36 138.535 158.388 124 156.29ZM120 204c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM156 136v-88C156 28.118 139.882 12 120 12 100.118 12 84 28.118 84 48v88C63.339 151.495 54.912 178.473 63.079 202.974 71.246 227.474 94.174 244 120 244c25.826 0 48.754-16.526 56.921-41.026C185.088 178.473 176.661 151.495 156 136ZM120 236C97.277 236.002 77.184 221.249 70.381 199.569c-6.803-21.681 1.259-45.268 19.909-58.249 1.083-.756 1.723-1.999 1.71-3.32v-90C92 32.536 104.536 20 120 20c15.464 0 28 12.536 28 28v90c-0 1.307 .638 2.532 1.71 3.28 18.687 12.969 26.776 36.579 19.969 58.283C162.871 221.267 142.747 236.027 120 236Z"),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
