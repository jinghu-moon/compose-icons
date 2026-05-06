package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlowerLotus: ImageVector
    get() {
        if (_flowerLotus != null) return _flowerLotus!!
        _flowerLotus = phosphorBoldIcon(
            name = "FlowerLotus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.3 119.63c-2.601-4.555-6.926-7.871-12-9.2-6.005-1.557-12.177-2.373-18.38-2.43 2.253-14.044 1.227-28.419-3-42C212.765 56.117 202.622 50.245 192.48 52.43c-9.225 2.035-18.064 5.537-26.18 10.37C159.774 50.814 150.816 40.323 140 32c-7.119-5.31-16.881-5.31-24 0C105.184 40.323 96.226 50.814 89.7 62.8 81.593 57.966 72.765 54.462 63.55 52.42 53.406 50.236 43.261 56.113 40.11 66c-4.227 13.581-5.253 27.956-3 42-6.213 .054-12.396 .871-18.41 2.43-5.074 1.329-9.399 4.645-12 9.2-2.689 4.63-3.41 10.145-2 15.31 3.55 13.16 14.4 38.16 47.14 57.72C84.16 212 112.76 212 128.08 212c15.32 0 43.76 0 76.07-19.34 32.74-19.56 43.59-44.56 47.14-57.72 1.413-5.164 .696-10.679-1.99-15.31ZM64.16 172.05C41.87 158.73 32.81 142.92 29.16 132.7c4.808-.768 9.693-.922 14.54-.46 2.413 6.098 5.271 12.01 8.55 17.69 5.495 9.498 12.069 18.33 19.59 26.32C69.3 175 66.74 173.6 64.16 172.05ZM79 147.27c-2.1-3-4.12-6-6-9.29C57.37 110.7 58.84 88.94 62 76.76c6.557 1.925 12.792 4.813 18.5 8.57C77.449 96.349 75.935 107.737 76 119.17c-.044 9.449 .963 18.873 3 28.1ZM128 185.27c-9.72-8.07-28-28.28-28-66.13 0-37.42 18-57.7 28-66.08 10 8.38 28 28.66 28 66.08 0 37.86-18.28 58.09-28 66.16ZM177 147.27c2.037-9.227 3.044-18.651 3-28.1 .065-11.433-1.449-22.821-4.5-33.84 5.708-3.759 11.943-6.651 18.5-8.58 3.13 12.19 4.6 34-11.06 61.23-1.84 3.25-3.86 6.34-5.94 9.29ZM191.86 172.05c-2.56 1.53-5.09 2.91-7.58 4.16 7.491-7.982 14.037-16.8 19.51-26.28 3.279-5.679 6.137-11.592 8.55-17.69 4.847-.462 9.732-.308 14.54 .46-3.69 10.22-12.75 26.03-35.04 39.35Z"),
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
