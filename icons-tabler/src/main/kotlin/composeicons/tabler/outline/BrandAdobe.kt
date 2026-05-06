package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobe: ImageVector
    get() {
        if (_brandAdobe != null) return _brandAdobe!!
        _brandAdobe = tablerOutlineIcon(
            name = "BrandAdobe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.893 4.514l7.977 14c.132 .233 .165 .509 .09 .765-.074 .257-.249 .473-.484 .6-.153 .084-.325 .127-.5 .127h-3.476L12 12.006 9.5 16.006h1.5l2 4h-8.977C3.458 20.006 3 19.556 3 19.006c0-.171 .045-.34 .13-.49L11.107 4.523c.185-.318 .525-.513 .893-.513 .368 0 .708 .195 .893 .513v-.009"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandAdobe!!
    }

private var _brandAdobe: ImageVector? = null
