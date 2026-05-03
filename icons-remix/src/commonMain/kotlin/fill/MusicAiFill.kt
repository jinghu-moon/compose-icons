package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MusicAiFill: ImageVector
    get() {
        if (_musicAiFill != null) return _musicAiFill!!
        _musicAiFill = remixIcon(
            name = "MusicAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.713 8.128 L 18.467 8.694 C 18.286 9.108 17.714 9.108 17.533 8.694 L 17.287 8.128 C 16.847 7.119 16.056 6.316 15.068 5.877 L 14.308 5.539 C 13.897 5.357 13.897 4.759 14.308 4.576 L 15.025 4.257 C 16.038 3.807 16.844 2.974 17.276 1.931 L 17.529 1.320 C 17.706 0.893 18.294 0.893 18.471 1.320 L 18.724 1.931 C 19.156 2.974 19.962 3.807 20.975 4.257 L 21.692 4.576 C 22.103 4.759 22.103 5.357 21.692 5.539 L 20.932 5.877 C 19.944 6.316 19.153 7.119 18.713 8.128 ZM 7.000 3.000 L 12.000 3.000 L 12.000 6.000 L 9.000 6.000 L 9.000 17.000 C 9.000 19.209 7.209 21.000 5.000 21.000 C 2.791 21.000 1.000 19.209 1.000 17.000 C 1.000 14.791 2.791 13.000 5.000 13.000 C 5.729 13.000 6.412 13.195 7.000 13.535 L 7.000 3.000 ZM 18.000 13.535 L 18.000 11.000 L 20.000 11.000 L 20.000 17.000 C 20.000 19.209 18.209 21.000 16.000 21.000 C 13.791 21.000 12.000 19.209 12.000 17.000 C 12.000 14.791 13.791 13.000 16.000 13.000 C 16.729 13.000 17.412 13.195 18.000 13.535 Z"),
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
        return _musicAiFill!!
    }

private var _musicAiFill: ImageVector? = null
