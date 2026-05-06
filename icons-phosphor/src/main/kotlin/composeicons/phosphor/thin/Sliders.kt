package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sliders: ImageVector
    get() {
        if (_sliders != null) return _sliders!!
        _sliders = phosphorThinIcon(
            name = "Sliders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 108.29v-68.29c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v68.29C38.233 110.287 28.019 122.089 28.019 136c0 13.911 10.213 25.713 23.981 27.71v52.29c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-52.29C73.767 161.713 83.981 149.911 83.981 136 83.981 122.089 73.767 110.287 60 108.29ZM56 156C44.954 156 36 147.046 36 136c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM132 60.29v-20.29c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20.29C110.233 62.287 100.019 74.089 100.019 88c0 13.911 10.213 25.713 23.981 27.71v100.29c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-100.29C145.767 113.713 155.981 101.911 155.981 88 155.981 74.089 145.767 62.287 132 60.29ZM128 108c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM228 168c-.001-13.918-10.225-25.722-24-27.71v-100.29c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v100.29c-13.767 1.997-23.981 13.799-23.981 27.71 0 13.911 10.213 25.713 23.981 27.71v20.29c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20.29c13.775-1.988 23.999-13.792 24-27.71ZM200 188c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _sliders!!
    }

private var _sliders: ImageVector? = null
