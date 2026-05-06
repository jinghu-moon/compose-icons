package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TaobaoLine: ImageVector
    get() {
        if (_taobaoLine != null) return _taobaoLine!!
        _taobaoLine = remixIcon(
            name = "TaobaoLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.173 14h-2.672v1.375c.549-.222 1.153-.491 1.812-.81-.027-.078-.055-.158-.083-.238l.942-.327ZM18.001 13.713l.119-.041c.642 1.851 1.035 3.012 1.186 3.5l-1.911 .589c-.074-.24-.217-.672-.427-1.292C10.886 19.352 8.296 18.522 7.959 14.561l1.993-.169c.099 1.165 .344 1.621 .896 1.752 .393 .093 .941 .063 1.652-.104v-2.039h-3.5v-2h.513L8.347 10.61C9.39 9.734 10.205 8.78 10.795 7.746c-.518 .134-1.038 .28-1.552 .435C8.709 8.965 8.125 9.668 7.49 10.29L6.09 8.862C7.363 7.614 8.423 5.953 9.266 3.868l1.854 .75c-.153 .379-.313 .746-.481 1.102 3.703-.935 7.276-1.317 9.139-.68 1.222 .418 1.918 1.391 2.187 2.584 .17 .756 .313 2.689 .313 5.122 0 2.808-.056 3.771-.34 4.622-.297 .89-.697 1.418-1.408 1.984-.657 .523-1.553 .763-2.644 .823-.673 .037-1.369 .003-2.095-.079-.119-.013-.234-.028-.354-.043-.069-.009-.143-.019-.242-.032l.264-1.983c.105 .014 .174 .023 .237 .032 .109 .014 .212 .027 .319 .039 .625 .07 1.216 .1 1.762 .07 .715-.039 1.246-.181 1.508-.391 .426-.339 .591-.558 .757-1.053 .185-.555 .237-1.448 .237-3.989 0-2.298-.133-4.102-.264-4.683-.13-.576-.411-.97-.883-1.131-1.207-.413-3.802-.194-6.652 .416l.614 .262c-.129 .303-.272 .599-.429 .89h5.337v2h-3.5v1.5h3.5v1.713ZM12.501 10.5h-1.208c-.444 .523-.942 1.024-1.493 1.5h2.702v-1.5ZM2.463 10.062 3.54 8.376c1.062 .679 2.936 2.427 3.338 3.162 1.239 2.259 .198 4.176-3.122 7.997L2.246 18.224C4.933 15.13 5.746 13.634 5.124 12.5 4.91 12.109 3.267 10.576 2.463 10.062ZM5.141 7.583C4.093 7.583 3.259 6.821 3.255 5.89c0-.939 .839-1.701 1.887-1.701 1.04 0 1.883 .758 1.883 1.701 0 .935-.843 1.693-1.883 1.693Z"),
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
        return _taobaoLine!!
    }

private var _taobaoLine: ImageVector? = null
