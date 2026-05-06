package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContractFill: ImageVector
    get() {
        if (_contractFill != null) return _contractFill!!
        _contractFill = remixIcon(
            name = "ContractFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2h-12C3.448 2 3 2.448 3 3v18c0 .552 .448 1 1 1h8.255C11.464 20.866 11 19.487 11 18c0-3.866 3.134-7 7-7 1.074 0 2.091 .242 3 .674v-4.674L16 2ZM13.786 15.327c.039-.727 .6-1.319 1.324-1.396l.871-.092c.103-.011 .201-.054 .278-.124l.651-.585c.542-.487 1.357-.508 1.923-.05l.681 .55c.081 .065 .18 .104 .284 .109l.874 .047c.727 .039 1.319 .6 1.396 1.324l.092 .871c.011 .103 .054 .201 .124 .278l.585 .651c.487 .542 .508 1.357 .05 1.923l-.55 .681c-.065 .081-.103 .18-.109 .284l-.047 .874c-.039 .727-.6 1.319-1.324 1.396l-.871 .092c-.103 .011-.201 .054-.278 .124l-.651 .585c-.542 .487-1.357 .508-1.923 .05l-.681-.55c-.081-.065-.18-.103-.284-.109l-.874-.047c-.727-.039-1.319-.6-1.396-1.324l-.092-.871c-.011-.103-.054-.201-.124-.278l-.585-.651c-.487-.542-.508-1.357-.05-1.923l.55-.681c.065-.081 .104-.18 .109-.284l.047-.874ZM21.03 17.03 19.97 15.97l-2.47 2.47L16.03 16.97l-1.061 1.061 2 2 .53 .53 .53-.53 3-3Z"),
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
        return _contractFill!!
    }

private var _contractFill: ImageVector? = null
