package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorFillIcon(
            name = "SpeakerLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 32.25v191.44c.05 2.914-1.435 5.64-3.91 7.18-2.829 1.683-6.401 1.461-9-.56l-65.57-51c-.963-.761-1.524-1.922-1.52-3.15v-96.32c.004-1.233 .576-2.395 1.55-3.15L147.12 25.69c2.96-2.294 7.115-2.227 10 .16 1.862 1.6 2.918 3.945 2.88 6.4ZM60 80h-28C23.163 80 16 87.163 16 96v64c0 8.837 7.163 16 16 16h28c2.209 0 4-1.791 4-4v-88c0-2.209-1.791-4-4-4ZM198 101.56c-1.876-2.196-4.789-3.211-7.624-2.655-2.834 .556-5.149 2.597-6.055 5.339-.907 2.742-.265 5.76 1.679 7.896 7.983 9.067 7.983 22.653 0 31.72-1.944 2.136-2.586 5.154-1.679 7.896 .907 2.742 3.221 4.783 6.055 5.339 2.834 .556 5.748-.459 7.624-2.655 13.313-15.113 13.313-37.767 0-52.88Z"),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
