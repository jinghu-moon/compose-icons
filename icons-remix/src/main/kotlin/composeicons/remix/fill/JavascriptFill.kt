package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.JavascriptFill: ImageVector
    get() {
        if (_javascriptFill != null) return _javascriptFill!!
        _javascriptFill = remixIcon(
            name = "JavascriptFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 3C4.343 3 3 4.343 3 6v12c0 1.657 1.343 3 3 3h12c1.657 0 3-1.343 3-3v-12C21 4.343 19.657 3 18 3h-12ZM13.334 16.055c.719 .579 1.437 .865 2.156 .858 .44 0 .777-.081 1.012-.242 .227-.154 .341-.374 .341-.66 0-.293-.114-.543-.341-.748-.235-.205-.678-.411-1.331-.616-.785-.227-1.39-.521-1.815-.88-.418-.359-.631-.862-.638-1.507 0-.609 .264-1.118 .792-1.529 .513-.411 1.17-.616 1.969-.616 1.115 0 2.009 .271 2.684 .814l-.77 1.199c-.271-.213-.583-.367-.935-.462-.352-.11-.667-.165-.946-.165-.381 0-.686 .07-.913 .209-.227 .139-.341 .323-.341 .55 0 .249 .139 .462 .418 .638 .279 .169 .755 .356 1.43 .561 .814 .242 1.393 .565 1.738 .968 .345 .403 .517 .917 .517 1.54 0 .638-.246 1.188-.737 1.65-.484 .455-1.188 .693-2.112 .715-1.21 0-2.222-.363-3.036-1.089l.858-1.188ZM7.804 16.693c.235 .147 .517 .22 .847 .22 .345 0 .631-.099 .858-.297 .227-.205 .341-.561 .341-1.067v-5.302h1.485v5.588c-.022 .865-.271 1.489-.748 1.87-.271 .227-.568 .389-.891 .484-.323 .095-.634 .143-.935 .143-.55 0-1.038-.095-1.463-.286-.455-.205-.836-.568-1.144-1.089l1.034-.847c.191 .257 .396 .451 .616 .583Z"),
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
        return _javascriptFill!!
    }

private var _javascriptFill: ImageVector? = null
