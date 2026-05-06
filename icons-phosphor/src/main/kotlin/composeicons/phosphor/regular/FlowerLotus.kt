package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlowerLotus: ImageVector
    get() {
        if (_flowerLotus != null) return _flowerLotus!!
        _flowerLotus = phosphorRegularIcon(
            name = "FlowerLotus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.83 121.63c-2.061-3.622-5.492-6.263-9.52-7.33-7.234-1.862-14.71-2.611-22.17-2.22 4-19.85 1-35.55-2.06-44.86C209.553 59.296 201.421 54.587 193.29 56.34c-10.176 2.266-19.852 6.374-28.55 12.12C158.369 55.446 149.094 44.07 137.63 35.21c-5.707-4.28-13.553-4.28-19.26 0C106.903 44.068 97.627 55.444 91.26 68.46 82.562 62.714 72.886 58.606 62.71 56.34 54.579 54.587 46.447 59.296 43.92 67.22c-3 9.31-6 25-2.06 44.86-7.46-.391-14.936 .358-22.17 2.22-4.028 1.067-7.459 3.708-9.52 7.33-2.157 3.71-2.734 8.131-1.6 12.27 3.39 12.57 13.8 36.48 45.33 55.32C85.43 208.06 113.13 208 128.05 208c14.92 0 42.67 0 74-18.78 31.53-18.84 41.94-42.75 45.33-55.32 1.149-4.132 .59-8.553-1.55-12.27ZM59.14 72.14c.025-.103 .126-.169 .23-.15 9.305 2.102 18.086 6.072 25.81 11.67C81.663 95.166 79.916 107.139 80 119.17c0 18.74 3.77 34 9.11 46.28C81.518 157.852 74.95 149.296 69.57 140 51.55 108.62 55.3 84 59.14 72.14ZM62.14 175.49C35.47 159.57 26.82 140.05 24 129.7c7.358-1.812 14.994-2.209 22.5-1.17 2.506 6.713 5.567 13.205 9.15 19.41 8.799 15.169 20.326 28.581 34 39.56C79.981 184.72 70.718 180.682 62.1 175.49ZM128 190.4C118.67 183.46 96 162.17 96 119.17 96 76.7 118.38 55.24 128 48c9.62 7.26 32 28.72 32 71.19 0 42.98-22.67 64.27-32 71.21ZM170.82 83.66C178.545 78.066 187.326 74.099 196.63 72c.104-.019 .205 .047 .23 .15C200.7 84 204.45 108.62 186.43 140c-5.375 9.309-11.944 17.875-19.54 25.48C172.23 153.22 176 137.94 176 119.2c.087-12.041-1.66-24.025-5.18-35.54ZM232 129.72c-2.77 10.25-11.4 29.81-38.09 45.77-8.619 5.189-17.881 9.223-27.55 12 13.674-10.979 25.201-24.391 34-39.56 3.583-6.205 6.644-12.697 9.15-19.41 7.504-1.034 15.137-.63 22.49 1.19Z"),
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
        return _flowerLotus!!
    }

private var _flowerLotus: ImageVector? = null
