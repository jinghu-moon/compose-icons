package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) return _speakerSlash!!
        _speakerSlash = phosphorFillIcon(
            name = "SpeakerSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L160 175.09v48.6c.05 2.914-1.435 5.64-3.91 7.18-2.829 1.683-6.401 1.461-9-.56l-65.55-51c-.965-.753-1.533-1.906-1.54-3.13v-89.09L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM186.71 155.16c3.311 2.924 8.365 2.61 11.29-.7 13.313-15.113 13.313-37.767 0-52.88-1.858-2.254-4.796-3.316-7.665-2.771-2.869 .545-5.214 2.61-6.117 5.388-.902 2.778-.219 5.827 1.782 7.954 7.983 9.067 7.983 22.653 0 31.72-2.921 3.314-2.603 8.368 .71 11.29ZM227.63 74.67c-1.874-2.24-4.821-3.281-7.686-2.715-2.866 .566-5.195 2.649-6.076 5.434-.882 2.785-.175 5.829 1.843 7.941 21.734 24.295 21.734 61.045 0 85.34-2.018 2.112-2.724 5.156-1.843 7.941 .882 2.785 3.211 4.868 6.076 5.434 2.866 .566 5.812-.474 7.686-2.715 27.158-30.367 27.158-76.293 0-106.66ZM153 119.87c1.107 1.255 2.878 1.689 4.44 1.087 1.562-.602 2.583-2.113 2.56-3.787v-84.92c.038-2.455-1.018-4.8-2.88-6.4-2.885-2.387-7.04-2.454-10-.16L103.83 59.33c-.88 .685-1.433 1.705-1.528 2.816-.095 1.111 .278 2.21 1.028 3.034ZM60 80h-28C23.163 80 16 87.163 16 96v64c0 8.837 7.163 16 16 16h28c2.209 0 4-1.791 4-4v-88c0-2.209-1.791-4-4-4Z"),
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
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
