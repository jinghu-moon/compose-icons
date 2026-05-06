package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorLightIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 75.4c-5.629-2.744-12.399-1.375-16.52 3.34l-35.74 38.52L140.71 34.13c-2.295-4.968-7.275-8.143-12.747-8.128-5.472 .015-10.435 3.217-12.703 8.198l-37 83.06L42.48 78.74C38.323 74.054 31.558 72.701 25.918 75.425c-5.641 2.725-8.784 8.865-7.698 15.035 0 .08 0 .16 .05 .24L41 194.57c1.234 6.607 6.989 11.405 13.71 11.43h146.58c6.74-.001 12.523-4.804 13.76-11.43L237.73 90.7c0-.08 0-.16 .05-.24C238.905 84.256 235.711 78.072 230 75.4ZM226 88.29 203.31 192.11c-.022 .079-.038 .159-.05 .24-.172 .966-1.019 1.665-2 1.65h-146.55c-.981 .015-1.828-.684-2-1.65-.012-.081-.028-.161-.05-.24L30 88.29c-.178-.868 .295-1.737 1.12-2.06 .797-.449 1.802-.244 2.36 .48l.12 .13 42 45.24c1.371 1.478 3.393 2.169 5.381 1.838 1.989-.33 3.679-1.637 4.499-3.478L126.18 39.16c.311-.723 1.033-1.183 1.82-1.16 .76-.032 1.463 .399 1.78 1.09l40.74 91.35c.82 1.842 2.51 3.148 4.499 3.478 1.989 .33 4.01-.361 5.381-1.838l42-45.24 .12-.13c.558-.724 1.563-.929 2.36-.48 .825 .323 1.298 1.192 1.12 2.06Z"),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
