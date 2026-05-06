package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorDuotoneIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c.004 34.314-18.307 66.021-48.03 83.168-29.723 17.146-66.338 17.124-96.04-.058h0L42.54 223.58c-2.875 .959-6.045 .211-8.188-1.932-2.143-2.143-2.891-5.313-1.932-8.188L44.89 176.07h0C24.688 141.127 28.501 97.279 54.431 66.348 80.361 35.416 122.87 24.007 160.803 37.799 198.736 51.591 223.991 87.637 224 128Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L52.33 56.66C21.732 89.128 15.236 137.488 36.18 176.88L24.83 210.93c-1.918 5.75-.421 12.09 3.865 16.375 4.286 4.286 10.626 5.782 16.375 3.865L79.12 219.82c36.2 19.257 80.336 15.446 112.7-9.73l10.26 11.29c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM128 216c-15.47 .011-30.669-4.063-44.06-11.81-1.985-1.147-4.366-1.387-6.54-.66L40 216 52.47 178.6c.727-2.174 .487-4.555-.66-6.54C32.573 138.782 37.16 96.869 63.14 68.54L181 198.23C165.742 209.771 147.131 216.011 128 216ZM232 128c0 17.187-4.253 34.106-12.38 49.25-2.112 3.853-6.936 5.282-10.806 3.2-3.87-2.082-5.336-6.895-3.284-10.78C223.218 136.813 218.259 96.372 193.158 68.761 168.056 41.15 128.269 32.373 93.88 46.86c-4.073 1.715-8.765-.197-10.48-4.27-1.715-4.073 .197-8.765 4.27-10.48 32.115-13.479 68.845-9.996 97.855 9.278C214.535 60.661 231.979 93.171 232 128Z"),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
