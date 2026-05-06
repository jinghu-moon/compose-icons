package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = phosphorRegularIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.67 60.89C225.697 53.697 217.148 49.125 207.85 48.15 206.234 33.444 195.786 21.224 181.509 17.343c-14.276-3.881-29.473 1.367-38.312 13.231-8.839 11.864-9.52 27.927-1.717 40.496 .004 .026 .004 .054 0 .08L71.17 141.51c0 0 0 0-.1 0-12.569-7.803-28.633-7.122-40.496 1.717-11.864 8.839-17.112 24.036-13.231 38.312 3.881 14.276 16.101 24.725 30.807 26.341 1.616 14.706 12.064 26.926 26.341 30.807 14.276 3.881 29.473-1.367 38.312-13.231 8.839-11.864 9.52-27.927 1.717-40.496-.002-.027-.002-.053 0-.08l70.35-70.36c0 0 0 0 .1 0 15.01 9.454 34.67 6.565 46.326-6.809 11.655-13.373 11.831-33.244 .414-46.821ZM219.1 97.16c-6.462 7.399-17.341 9.01-25.67 3.8-6.323-4.012-14.582-3.102-19.88 2.19l-70.4 70.4c-5.279 5.308-6.172 13.566-2.15 19.88 4.68 7.529 3.846 17.24-2.05 23.861-5.896 6.62-15.446 8.569-23.465 4.789C67.467 218.299 62.894 209.691 64.25 200.93c.363-2.311-.305-4.665-1.826-6.443-1.521-1.777-3.745-2.799-6.084-2.797-.412 .003-.823 .037-1.23 .1-8.751 1.346-17.345-3.223-21.125-11.229-3.78-8.007-1.846-17.546 4.754-23.447 6.6-5.902 16.295-6.762 23.831-2.113 6.323 4.012 14.582 3.102 19.88-2.19L152.85 82.41c5.258-5.301 6.151-13.535 2.15-19.84-4.68-7.529-3.846-17.24 2.05-23.861 5.896-6.62 15.446-8.569 23.465-4.789 8.019 3.781 12.591 12.389 11.235 21.149-.395 2.525 .44 5.086 2.247 6.893 1.807 1.807 4.368 2.642 6.893 2.247 8.345-1.35 16.637 2.692 20.715 10.097 4.077 7.405 3.059 16.574-2.545 22.903Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
