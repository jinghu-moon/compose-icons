package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorRegularIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 80v144c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-136h-116.69l34.35 34.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-48-48-.06-.07c-.16-.16-.32-.34-.47-.52l-.23-.31c-.082-.103-.159-.209-.23-.32l-.23-.37c-.063-.097-.119-.197-.17-.3-.07-.12-.13-.25-.19-.38-.06-.13-.1-.21-.15-.33-.05-.12-.09-.25-.14-.37l-.13-.36-.09-.39c0-.13-.07-.25-.1-.37-.03-.12 0-.31-.06-.46-.06-.15 0-.21-.05-.32-.05-.525-.05-1.055 0-1.58 0-.11 0-.21 .05-.32 .05-.11 0-.31 .06-.46 .06-.15 .06-.24 .1-.37l.09-.39 .13-.36c.05-.12 .09-.25 .14-.37 .05-.12 .1-.22 .15-.33 .05-.11 .12-.26 .19-.38 .051-.103 .107-.203 .17-.3l.23-.37c.071-.111 .148-.217 .23-.32l.23-.31c.15-.18 .31-.36 .47-.52l.06-.07L90.34 26.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L67.31 72h124.69c4.418 0 8 3.582 8 8Z"),
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
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
