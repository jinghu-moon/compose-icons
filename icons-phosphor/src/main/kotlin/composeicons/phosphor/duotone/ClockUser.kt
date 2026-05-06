package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorDuotoneIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c.02 14.111-3.085 28.051-9.09 40.82-3.667-11.688-15.548-18.738-27.564-16.357-12.016 2.381-20.31 13.429-19.244 25.632 1.066 12.203 11.151 21.645 23.398 21.905h0c-12.164 .102-23.295 6.857-29 17.6C123.248 232.716 78.728 220.52 52.66 187.51 26.592 154.5 25.048 108.365 48.851 73.687 72.654 39.008 116.259 23.863 156.434 36.321 196.608 48.779 223.994 85.938 224 128Z"),
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
                pathData = parseSvgPathData("M136 72v43.05L172.42 96.84c3.952-1.977 8.758-.377 10.735 3.575 1.977 3.952 .377 8.758-3.575 10.735l-48 24c-2.479 1.241-5.424 1.109-7.783-.347C121.438 133.346 120.001 130.772 120 128v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C232 70.562 185.438 24 128 24 70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM231.73 221.94c.798 2.783 .03 5.78-2.008 7.836-2.038 2.056-5.028 2.851-7.818 2.078-2.79-.773-4.945-2.993-5.634-5.805C213.44 215.42 203.46 208 192 208c-11.46 0-21.44 7.42-24.27 18.05-.93 3.507-4.102 5.949-7.73 5.95-.695-.002-1.388-.092-2.06-.27-4.269-1.138-6.808-5.521-5.67-9.79 2.595-9.635 8.698-17.953 17.11-23.32-9.159-9.149-11.903-22.916-6.953-34.878 4.951-11.962 16.622-19.762 29.568-19.762 12.946 0 24.617 7.8 29.568 19.762 4.951 11.962 2.207 25.728-6.952 34.878 8.416 5.365 14.523 13.683 17.12 23.32ZM176 176c0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16Z"),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
