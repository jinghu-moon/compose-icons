package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCashapp: ImageVector
    get() {
        if (_brandCashapp != null) return _brandCashapp!!
        _brandCashapp = tablerOutlineIcon(
            name = "BrandCashapp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.1 8.648c-.213 .198-.542 .203-.761 .011C15.315 7.795 14.019 7.32 12.68 7.319c-1.102 0-2.205 .363-2.205 1.374 0 1.023 1.182 1.364 2.546 1.875 2.386 .796 4.363 1.796 4.363 4.137 0 2.545-1.977 4.295-5.204 4.488l-.295 1.364c-.054 .258-.282 .443-.546 .443h-2.034l-.102-.011c-.303-.068-.495-.366-.432-.67l.318-1.444C7.864 18.568 6.738 17.954 5.816 17.091v-.011c-.103-.102-.161-.241-.161-.386 0-.145 .058-.284 .161-.387L6.953 15.205c.214-.2 .547-.2 .761 0 1.04 .982 2.422 1.52 3.852 1.5 1.478 0 2.466-.625 2.466-1.614 0-.989-1-1.25-2.886-1.954C9.146 12.421 7.248 11.409 7.248 9.046c0-2.75 2.284-4.091 4.989-4.216l.284-1.398c.054-.256 .283-.438 .545-.432h2.023l.114 .012c.142 .03 .266 .115 .345 .236 .079 .121 .106 .269 .075 .411l-.307 1.557c1.031 .342 1.988 .879 2.818 1.58l.023 .022c.216 .228 .216 .569 0 .773L17.1 8.648"),
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
        return _brandCashapp!!
    }

private var _brandCashapp: ImageVector? = null
