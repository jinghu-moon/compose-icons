package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BaiduLine: ImageVector
    get() {
        if (_baiduLine != null) return _baiduLine!!
        _baiduLine = remixIcon(
            name = "BaiduLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.563 19.28c.17 .008 .367 .011 .584 .007 .626-.012 1.277-.082 1.912-.224 1.013-.225 2.018-.248 2.981-.131 .547 .067 .985 .165 1.288 .257 1.078 .275 2.611 .223 3.006-.411 .291-.467 .253-.787-.026-1.198-.061-.089-.126-.17-.189-.236-.009-.009-.017-.018-.024-.025-.066-.053-.103-.082-.164-.132-.176-.143-.37-.306-.579-.486-.595-.514-1.191-1.072-1.753-1.659-.606-.633-1.138-1.265-1.577-1.894l-.036-.053c-.742-1.139-1.558-1.067-2.002-.317-.282 .476-.602 .918-.955 1.332-.41 .482-.83 .89-1.306 1.296-.123 .105-.503 .42-.412 .344-.004 .003-.017 .015 .051-.071-.098 .121-.95 .878-1.201 1.162-.515 .583-.722 1.081-.645 1.481 .072 .375 .219 .587 .45 .744 .118 .08 .254 .142 .389 .183 .035 .01 .065 .018 .09 .024 .033 .002 .072 .005 .117 .007ZM14.662 12.004c1.376 1.97 3.732 3.793 3.732 3.793 0 0 2.064 1.748 .638 4.038-1.426 2.291-5.253 1.278-5.253 1.278 0 0-1.52-.489-3.286-.097-1.765 .395-3.286 .245-3.286 .245 0 0-2.206-.245-2.652-2.559C4.107 16.387 6.613 14.661 6.811 14.417c.195-.247 1.512-1.073 2.452-2.659 .94-1.586 3.584-2.54 5.398 .245ZM20.2 10.585c0 .457 .191 2.393-1.552 2.431-1.743 .039-1.816-1.178-1.816-2.05 0-.913 .188-2.205 1.59-2.205 1.4 0 1.778 1.369 1.778 1.823ZM14.771 7.807C13.591 7.655 13.324 6.585 13.438 5.514c.095-.876 1.143-2.219 1.981-2.027 .837 .191 1.6 1.3 1.446 2.255-.151 .956-.911 2.218-2.093 2.064ZM9.755 7.44C8.894 7.44 8.194 6.447 8.194 5.219 8.194 3.993 8.893 3 9.755 3c.863 0 1.56 .993 1.56 2.219 0 1.228-.697 2.221-1.56 2.221ZM5.962 12.006C4.267 12.371 3.635 10.409 3.821 9.491c0 0 .201-1.987 1.576-2.11C6.491 7.286 7.296 8.482 7.379 9.166c.051 .444 .282 2.475-1.417 2.84Z"),
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
        return _baiduLine!!
    }

private var _baiduLine: ImageVector? = null
